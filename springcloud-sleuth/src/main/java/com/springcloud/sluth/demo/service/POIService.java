package com.springcloud.sluth.demo.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

@Service
public class POIService {
	public  String createExcel() {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFCellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setBold(false);
		font.setFontName("楷体");
		font.setFontHeight(14);
		style.setFont(font);
		style.setBorderLeft(BorderStyle.DASHED);
		style.setBorderRight(BorderStyle.DASHED);
		style.setBorderBottom(BorderStyle.DASHED);
		style.setBorderTop(BorderStyle.DASHED);
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setDataFormat(1);
		style.setFont(font);
		style.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
	    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		XSSFCellStyle style2 = workbook.createCellStyle();
		XSSFFont font2 = workbook.createFont();
		font2.setBold(false);
		font2.setFontName("楷体");
		font2.setFontHeight(14);
		style.setFont(font);
	    style2.setBorderLeft(BorderStyle.DASHED);
		style2.setBorderRight(BorderStyle.DASHED);
		style2.setBorderBottom(BorderStyle.DASHED);
		style2.setBorderTop(BorderStyle.DASHED);
		style2.setAlignment(HorizontalAlignment.CENTER);
		style2.setDataFormat(1);
		style2.setFont(font2);
		XSSFSheet sheet = workbook.createSheet();
		XSSFRow xssfRow = sheet.createRow(0);
		xssfRow.setRowStyle(style);
		XSSFCell xssfCell0= xssfRow.createCell(0);
		XSSFCell xssfCell1= xssfRow.createCell(1);
		XSSFCell xssfCell2 = xssfRow.createCell(2);
		XSSFCell xssfCell3 = xssfRow.createCell(3);
		XSSFCell xssfCell4 = xssfRow.createCell(4);
		XSSFCell xssfCell5 = xssfRow.createCell(5);
		xssfCell0.setCellValue("学号");
		xssfCell0.setCellStyle(style);
		xssfCell1.setCellValue("姓名");
		xssfCell1.setCellStyle(style);
		xssfCell2.setCellValue("性别");
		xssfCell2.setCellStyle(style);
		xssfCell3.setCellValue("年龄");
		xssfCell3.setCellStyle(style);
		xssfCell4.setCellValue("出生日期");
		xssfCell4.setCellStyle(style);
		xssfCell5.setCellValue("家庭住址");
		xssfCell5.setCellStyle(style);
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,1));
		for(int i=1;i<10;i++) {
			XSSFRow xssfRow2 = sheet.createRow(i);
			XSSFCell xssfCelli0= xssfRow2.createCell(0);
			XSSFCell xssfCelli1= xssfRow2.createCell(1);
			XSSFCell xssfCelli2 = xssfRow2.createCell(2);
			XSSFCell xssfCelli3 = xssfRow2.createCell(3);
			XSSFCell xssfCelli4 = xssfRow2.createCell(4);
			XSSFCell xssfCelli5 = xssfRow2.createCell(5);
			xssfCelli0.setCellValue("1060314024044");
			xssfCelli0.setCellStyle(style2);
			xssfCelli1.setCellValue("zhangsan");
			xssfCelli1.setCellStyle(style2);
			xssfCelli2.setCellValue("男");
			xssfCelli2.setCellStyle(style2);
			xssfCelli3.setCellValue(20);
			xssfCelli3.setCellStyle(style2);
			xssfCelli4.setCellValue(new Date());
			xssfCelli4.setCellStyle(style2);
			xssfCelli5.setCellValue("陕西省西安市区");
			xssfCelli5.setCellStyle(style2);
		}
		try {
			FileOutputStream out = new FileOutputStream("e:\\学生信息.xls");
			workbook.write(out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
}
