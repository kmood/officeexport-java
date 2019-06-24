package com.project.upload.service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.core.utils.JsonBinder;
import com.google.gson.Gson;

import hprose.client.HproseHttpClient;

@Service
@RestController
@RequestMapping("/file")
public class UploadService {

	@Autowired
	private ServletContext servletContext;
	
	/**
	 * 
	 * @Title uploadFiles
	 * @Description TODO
	 * @param request
	 * @param response
	 * @param foleName
	 * @return
	 * @author SunBC
	 * @throws Throwable 
	 * @time 2018年7月12日 下午5:18:35
	 */
	@RequestMapping(value = "/uploadFiles", produces = "text/html;charset=UTF-8")
	public Object uploadFiles(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("foleName") String foleName) throws Throwable{
		response.setHeader("Access-Control-Allow-Origin", "*");
		String fileName = "";
		long size = 0L;
		String url = "";
		String format = "";
		String path = "";
		String relativePath = "";
	
		// 创建一个通用的多部分解析器
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		String myFileName = "";
		// 判断 request 是否有文件上传,即多部分请求
		if (multipartResolver.isMultipart(request)) {
			// 转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 取得request中的所有文件名
			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				// 记录上传过程起始时的时间，用来计算上传时间
				// int pre = (int) System.currentTimeMillis();
				// 取得上传文件
				MultipartFile file = multiRequest.getFile(iter.next());
				if (file != null) {
					// 取得当前上传文件的文件名称
					myFileName = file.getOriginalFilename();
					// myFileName1 = new
					// String(myFileName.getBytes("utf-8"), "iso-8859-1");
					format = myFileName.substring(myFileName.lastIndexOf("."), myFileName.lastIndexOf(""));
					// 重命名上传后的文件名
					String nowDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
					fileName = StringUtils.substringBeforeLast(myFileName, ".")+"-"+nowDate + format;
					size = file.getSize();
					url = File.separator+"resources" +File.separator+ foleName;

					// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
					if (myFileName.trim() != "") {
						String folderPath = StringUtils.substringBeforeLast(request.getServletContext().getRealPath("/"), "/") + url;
						File folder = new File(folderPath);
						if (!folder.exists()) {
							folder.mkdirs();
						}
						path = folderPath + File.separator + fileName;
						File localFile = new File(path);
						file.transferTo(localFile);
					}
					relativePath = url+File.separator + fileName;
					
				}
			}
		}
		return relativePath.replace("\\", "/");
	}

}
