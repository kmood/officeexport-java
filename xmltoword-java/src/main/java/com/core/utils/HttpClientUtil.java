package com.core.utils;


import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.util.EncodingUtil;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class HttpClientUtil {
	private static HttpClient client = null;

	// 构造单例
	private HttpClientUtil() {

		MultiThreadedHttpConnectionManager httpConnectionManager = new MultiThreadedHttpConnectionManager();
		HttpConnectionManagerParams params = new HttpConnectionManagerParams();
		// 默认连接超时时间
		params.setConnectionTimeout(60000);
		// 默认读取超时时间
		params.setSoTimeout(60000);
		// 默认单个host最大连接数
		params.setDefaultMaxConnectionsPerHost(200);// very important!!
		// 最大总连接数
		params.setMaxTotalConnections(500);// very important!!
		httpConnectionManager.setParams(params);

		client = new HttpClient(httpConnectionManager);

		client.getParams().setConnectionManagerTimeout(3000);
		// client.getParams().setIntParameter("http.socket.timeout", 10000);
		// client.getParams().setIntParameter("http.connection.timeout", 5000);
	}

	private static class ClientUtilInstance {
		private static final HttpClientUtil ClientUtil = new HttpClientUtil();
	}

	public static HttpClientUtil getInstance() {
		return ClientUtilInstance.ClientUtil;
	}

	/**
	 * 发送http GET请求，并返回http响应字符串
	 * 
	 * @param urlstr
	 *            完整的请求url字符串
	 * @return
	 */
	public String doGetRequest(String urlstr) {
		String response = "";

		HttpMethod httpmethod = new GetMethod(urlstr);
		httpmethod.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
		try {
			int statusCode = client.executeMethod(httpmethod);
			InputStream _InputStream = null;
			if (statusCode == HttpStatus.SC_OK) {
				_InputStream = httpmethod.getResponseBodyAsStream();
			}
			if (_InputStream != null) {
				response = GetResponseString(_InputStream, "UTF-8");
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			httpmethod.releaseConnection();
		}
		return response;
	}
	/**
	 * 
	 * @Title doPostRequest
	 * @Description TODO
	 * @param postUrl
	 * @param params
	 * @return
	 * @author SunBC
	 * @time 2018年9月14日 下午1:51:36
	 */
	public String doPostRequest(String postUrl,HashMap<String, Object> params) {
		String response = "";
		PostMethod postMethod = new PostMethod(postUrl);
		if(params != null){
			Set<String> keySet = params.keySet();
			for (String paramName : keySet) {
				postMethod.addParameter(paramName, (String)params.get(paramName));
			}
		}
		//指定参数编码
		postMethod.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		try {
			int statusCode = client.executeMethod(postMethod);
			if (statusCode == HttpStatus.SC_OK) {
				InputStream _InputStream = null;
				if (statusCode == HttpStatus.SC_OK) {
					_InputStream = postMethod.getResponseBodyAsStream();
				}
				if (_InputStream != null) {
					response = GetResponseString(_InputStream, "UTF-8");
				}
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			postMethod.releaseConnection();
		}
		return response;
	}
	/**
	 * 
	 * @Title doPostRequest
	 * @Description TODO
	 * @param postUrl
	 * @param params
	 * @param filePath
	 * @return
	 * @author SunBC
	 * @time 2018年10月12日 下午12:46:19
	 */
	public String doPostRequest(String postUrl,HashMap<String, Object> params,String... filePath ) {
		String response = "";
		Part[] parts = new Part[params.size()+filePath.length] ;
		int index = 0;
		PostMethod postMethod = new PostMethod(postUrl);
		try {
			//设置参数
			postMethod.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
			if(params != null){
				Set<String> keySet = params.keySet();
				for (String paramName : keySet) {
					postMethod.addParameter(paramName, (String)params.get(paramName));

					StringPart idPart = new StringPart(paramName, String.valueOf(params.get(paramName)));
					idPart.setCharSet("utf-8");
					parts[index++] = idPart;
				}
			}
			// 添加文件
			for (String path : filePath) {
				File file =new File(path);
				 if(file.exists()){
					 FilePart fp = new CustomFilePart("file", file);
					 fp.setCharSet("utf-8");

					 parts[index++] = fp;
			     }
			}
			postMethod.setRequestEntity(new MultipartRequestEntity(parts, postMethod.getParams()));
			int statusCode = client.executeMethod(postMethod);
//			if (statusCode == HttpStatus.SC_OK) {
				InputStream _InputStream = null;
				if (statusCode == HttpStatus.SC_OK) {
					_InputStream = postMethod.getResponseBodyAsStream();
				}
				if (_InputStream != null) {
					response = GetResponseString(_InputStream, "UTF-8");
				}
//			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			postMethod.releaseConnection();
		}
		return response;
	}
	/**
	 * 
	 * @param _InputStream
	 * @param Charset
	 * @return
	 */
	public String GetResponseString(InputStream _InputStream, String Charset) {
		String response = "";
		try {
			if (_InputStream != null) {
				StringBuffer buffer = new StringBuffer();
				InputStreamReader isr = new InputStreamReader(_InputStream, Charset);
				Reader in = new BufferedReader(isr);
				int ch;
				while ((ch = in.read()) > -1) {
					buffer.append((char) ch);
				}
				response = buffer.toString();
				buffer = null;
			}
		} catch (Exception e) {
			response = response + e.getMessage();
			e.printStackTrace();
		}
		return response;
	}
	/**
	 * description:转换文件名到utf-8
	 */
	public class CustomFilePart extends FilePart {

		public CustomFilePart(String name, File file) throws FileNotFoundException {
			super(name, file);
			// TODO Auto-generated constructor stub
		}
		protected void sendDispositionHeader(OutputStream out) throws IOException {
			out.write(CONTENT_DISPOSITION_BYTES);
			out.write(QUOTE_BYTES);
			out.write(EncodingUtil.getAsciiBytes(this.getName()));
			out.write(QUOTE_BYTES);
			String filename = getSource().getFileName();
			if (filename != null) {
				out.write(EncodingUtil.getAsciiBytes(FILE_NAME));
				out.write(QUOTE_BYTES);
				out.write(EncodingUtil.getBytes(filename, getCharSet()));
				out.write(QUOTE_BYTES);
			}
		}


	}
}
