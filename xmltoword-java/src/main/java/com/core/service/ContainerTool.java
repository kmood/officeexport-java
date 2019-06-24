package com.core.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import javax.servlet.ServletContext;

import cn.afterturn.easypoi.word.WordExportUtil;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.servicehandler.ServiceHandler;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;


@Service
public class ContainerTool {
	@Autowired
	private ServletContext servletContext;
	private static final Logger logger = Logger.getLogger(ContainerTool.class);
	
	/**
	 * 模板与导出文件均为xlsx文件
	 *
	 * @Title commonExport
	 * @Description TODO
	 * @param map 数据map
	 * @param mblj 模板相对路径 例："/resources/model/yjxxlb.xlsx"
	 * @param dcljTemp  导出目录（相对导出目录，
	 * 					不包含文件名最后一级目录 例：
	 * 					File.separator +"resources" +File.separator+ "temp"+File.separator ）
	 * @param dcwjm 导出文件名
	 * @return
	 * @author SunBC
	 * @time 2018年9月3日 上午11:11:31
	 */
	public  String commonExport(Map<String, Object> map,String mblj,String dcljTemp,String dcwjm){
		String exportPath = "";
		String modelRealPath = servletContext.getRealPath(mblj);
		FileOutputStream fos = null;
		try {
			TemplateExportParams params = new TemplateExportParams(modelRealPath);
			Workbook workbook = ExcelExportUtil.exportExcel(params, map);
			String webappPath = servletContext.getRealPath("/");
			// 获取excel导出路径
			File file = new File(webappPath +dcljTemp);
			// 如果文件夹不存在则创建
			if (!file.exists() && !file.isDirectory()) {
				file.mkdirs();
			}
			String fileName =dcwjm+"_"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
			exportPath = (dcljTemp + fileName+".xlsx");
			String excelExportPath = webappPath + exportPath;

			fos = new FileOutputStream(excelExportPath);
			workbook.write(fos);
		} catch (Throwable e) {
			logger.error("excel导出工具写入本地文件失败！"+e);
		}finally{
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					logger.error("excel导出工具关闭流失败！"+e);
				}
			}
		}
		return exportPath;

	}


	/**
	 * 模板与导出文件均为docx文件
	 *
	 * @Title commonWordExport
	 * @Description TODO
	 * @param map 数据map
	 * @param mblj 模板相对路径 例："/resources/model/yjxxlb.xlsx"
	 * @param dcljTemp  导出目录（相对导出目录，
	 * 					不包含文件名最后一级目录 例：
	 * 					File.separator +"resources" +File.separator+ "temp"+File.separator ）
	 * @param dcwjm 导出文件名
	 * @return
	 * @author SunBC
	 * @time 2018年9月3日 上午11:11:31
	 */
	public  String commonWordExport(Map<String, Object> map,String mblj,String dcljTemp,String dcwjm){
		String exportPath = "";
		String modelRealPath = servletContext.getRealPath(mblj);
		FileOutputStream fos = null;
		try {
			XWPFDocument doc = WordExportUtil.exportWord07(modelRealPath, map);
			String webappPath = servletContext.getRealPath("/");
			// 获取excel导出路径
			File file = new File(webappPath +dcljTemp);
			// 如果文件夹不存在则创建
			if (!file.exists() && !file.isDirectory()) {
				file.mkdirs();
			}
			String fileName =dcwjm+"_"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
			exportPath = (dcljTemp + fileName+".xlsx");
			String excelExportPath = webappPath + exportPath;
			fos = new FileOutputStream(excelExportPath);
			doc.write(fos);
		} catch (Throwable e) {
			logger.error("excel导出工具写入本地文件失败！"+e);
		}finally{
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					logger.error("excel导出工具关闭流失败！"+e);
				}
			}
		}
		return exportPath;

	}
}
