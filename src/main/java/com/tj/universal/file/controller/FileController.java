package com.tj.universal.file.controller;

import com.tj.universal.date.DateUtil;
import com.tj.universal.entity.ResultDto;
import com.tj.universal.file.entity.Concart;
import com.tj.universal.file.entity.ConcartModel;
import com.tj.universal.file.entity.Date;
import com.tj.universal.file.entity.TimeOrder;
import com.tj.universal.file.util.ExcelUtil;
import com.tj.universal.file.util.FileUtil;
import com.tj.universal.file.util.JxlsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TJ
 * @description TODO
 * @date 2021/4/9 15:53
 **/
@RequestMapping("file")
@RestController
public class FileController {


    Logger log = LoggerFactory.getLogger(FileController.class);

    @Value("${file-excel.window.template-path}")
    private String templatePath;

    @Value("${file-excel.linux.export-path}")
    private String exportPath;

    @Value("${file-excel.linux.path}")
    private String path;

    /**
     * @function 下载模板
     * @params
     **/
    @RequestMapping("/download")
    @ResponseBody
    public void downloadExcel(HttpServletResponse response) {
        String filePath = (templatePath + "小型合同信息模板.xlsx");
        FileUtil.wrapDownloadResponse(response, "小型合同信息模板.xlsx", filePath);
    }

    /**
     * @function 导出
     * @params
     **/
    @RequestMapping("/export")
    @ResponseBody
    public void export(HttpServletResponse response) {
        // 模拟查询数据
        List<Concart> dataList = new ArrayList<Concart>() {{
            add(new Concart(1, "1", "1"));
            add(new Concart(2, "2", "2"));
            add(new Concart(3, "3", "3"));
        }};
        final Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("dataList", dataList);

        // 调用Excel工具类,导出数据
        ExcelUtil.exportFile("template/小型合同信息.xlsx", "小型合同信息.xlsx", dataMap, response);
    }

    /**
     * @function 合并单元格导出
     * @params
     **/
    @RequestMapping("/export2")
    @ResponseBody
    public String export2(HttpServletResponse response) {
        // 模拟查询数据
        List<Date> dateList = new ArrayList<Date>() {{
            add(new Date("2020-04-03", new ArrayList<TimeOrder>() {{
                add(new TimeOrder("9:30-12:30", "1", null, null));
                add(new TimeOrder("12:30-14:30", null, "2", null));
                add(new TimeOrder("14:30-18:30", null, null, "3"));

            }}));
            add(new Date("2020-04-04", new ArrayList<TimeOrder>() {{
                add(new TimeOrder("9:30-12:30", "a", null, null));
                add(new TimeOrder("12:30-14:30", "a", null, null));
                add(new TimeOrder("14:30-18:30", "a", null, null));

            }}));
            add(new Date("2020-04-05", new ArrayList<TimeOrder>() {{
                add(new TimeOrder("9:30-12:30", null, "b", null));
                add(new TimeOrder("12:30-14:30", null, "b", null));
                add(new TimeOrder("14:30-18:30", null, "b", null));

            }}));
        }};
        Map<String, Object> model = new HashMap<>(10);
        model.put("dateList", dateList);

        exportPath = exportPath + DateUtil.getYear() + "洋泾文化活动中心活动室安排表.xlsx";
        path = path + DateUtil.getYear() + "洋泾文化活动中心活动室安排表.xlsx";
        try {
            JxlsUtils.exportExcel(templatePath+"2021洋泾文化活动中心活动室安排表.xlsx", new FileOutputStream(exportPath), model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }

    /**
     * @function 导入
     * @params
     **/
    @RequestMapping("/import")
    @ResponseBody
    public ResultDto importExcel(HttpServletRequest request, @RequestParam("file") MultipartFile[] files) throws Exception {
        if (files != null && files.length > 0) {
            MultipartFile file = files[0];
            List<Object> list = ExcelUtil.readExcel(file, new ConcartModel(), 1, 1);
            List<ConcartModel> concartModelArrayList = new ArrayList<>();
            if (list != null && list.size() > 0) {
                for (Object o : list) {
                    ConcartModel concartModel = (ConcartModel) o;
                    // 数据处理
                    concartModelArrayList.add(concartModel);
                }
            }
            // 数据导入
            if (null != concartModelArrayList && 0 < concartModelArrayList.size()) {
                // 业务代码数据导入
                log.info(concartModelArrayList.toString());
            }
        }

        return ResultDto.success("导入成功");
    }

}
