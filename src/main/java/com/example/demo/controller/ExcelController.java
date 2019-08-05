package com.example.demo.controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.demo.entity.ExcelPropertyIndexModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName ExcelController
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/5 22:34
 * @ModifyDate 2019/8/5 22:34
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo")
public class ExcelController {


    @GetMapping("/a.html")
    public void cooperation(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletOutputStream out = null;
        try {
            out = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename="+"with"+".xlsx");
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
        String fileName = new String(("UserInfo " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
                .getBytes(), "UTF-8");
        Sheet sheet1 = new Sheet(1, 0);
        sheet1.setSheetName("第一个sheet");
        List<ExcelPropertyIndexModel> data = new ArrayList<>();
        writer.write(data,sheet1);
      //  writer.write0(getListString(), sheet1);
        writer.finish();

        out.flush();
    }
}




