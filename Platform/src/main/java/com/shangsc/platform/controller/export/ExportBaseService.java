package com.shangsc.platform.controller.export;

import com.shangsc.platform.util.ToolPoi;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 通用导出类
 *
 * @author ssk
 * @create 2017-08-21-下午 1:53
 */
public abstract class ExportBaseService {

    public final Logger logger = LoggerFactory.getLogger(this.getClass());


    public String export(String filename, List<String> listHeader, List<Object[]> objects) {
        SXSSFWorkbook wb = new SXSSFWorkbook();
        Sheet sheet = wb.createSheet(filename);

        // 表头
        Row rowHead = sheet.createRow(0);
        for (int i = 0; i < listHeader.size(); i++) {
            Cell cell = rowHead.createCell(i);
            cell.setCellValue(listHeader.get(i));
            sheet.setColumnWidth(i, 10 * 256);
        }
        // 表头样式
        ToolPoi.setHeadStyle(wb, rowHead.cellIterator());

        // 基本样式
        XSSFColor color = new XSSFColor(new java.awt.Color(255, 255, 255));
        Font font = ToolPoi.createFont(wb, Font.BOLDWEIGHT_NORMAL, Font.COLOR_NORMAL, (short) 10);
        CellStyle style = ToolPoi.createBorderCellStyle(wb, HSSFColor.WHITE.index, color, CellStyle.ALIGN_CENTER, font);

        // 样式换行
        CellStyle wrap = wb.createCellStyle();
        wrap.cloneStyleFrom(style);
        wrap.setWrapText(true);

        // 绿色
        XSSFCellStyle blue = (XSSFCellStyle) wb.createCellStyle();
        blue.cloneStyleFrom(style);
        blue.setFillForegroundColor(new XSSFColor(new java.awt.Color(0, 164, 137)));

        // 红色
        XSSFCellStyle red = (XSSFCellStyle) wb.createCellStyle();
        red.cloneStyleFrom(style);
        red.setFillForegroundColor(new XSSFColor(new java.awt.Color(243, 123, 83)));


        // 处理数据
        for (int i = 0; i < objects.size(); i++) {
            Object[] obj = objects.get(i);
            // 创建行
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < obj.length; j++) {
                Cell cell = row.createCell(j);
                cell.setCellStyle(style);
                cell.setCellValue(ObjectUtils.toString(obj[j]));
            }

        }

        String path = ToolPoi.writeExcel(wb, filename);

        return path;
    }
}
