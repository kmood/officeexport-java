package com.test.alibaba.easyexcel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: SunBC
 * @Date: 2019/4/15 15:49
 * @Description:
 */
public class easyExcelImport {
    @Test
    public void testExcel2003NoModel() {
        BufferedInputStream inputStream = null;
        try {
            ExcelListener excelListener = new ExcelListener();
            inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\admin\\Desktop\\OldDesktop\\snoa\\test.xlsx"));
            // 解析每行结果在listener中处理
            EasyExcelFactory.readBySax(inputStream, new Sheet(0, 3),excelListener);
//            ExcelListener listener = new ExcelListener();
//            ExcelReader excelReader = new ExcelReader(inputStream, null, listener);
//            excelReader.read();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
