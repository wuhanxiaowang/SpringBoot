package com.example.demo.util;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.demo.entity.ExcelPropertyIndexModel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ExcelUtil
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/5 22:25
 * @ModifyDate 2019/8/5 22:25
 * @Version 1.0
 */
public class ExcelUtil {


    public static void main(String[] args) throws FileNotFoundException {
        OutputStream out = new FileOutputStream("D:\\withHead.xlsx");
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
        Sheet sheet1 = new Sheet(1, 0, ExcelPropertyIndexModel.class);
        sheet1.setSheetName("sheet1");
        List<ExcelPropertyIndexModel> data = new ArrayList<>();
        writer.write(data, sheet1);
        writer.finish();



    }






}
