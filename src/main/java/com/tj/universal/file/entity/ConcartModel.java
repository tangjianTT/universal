package com.tj.universal.file.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * @author TJ
 * @description TODO
 * @date 2021/4/9 16:49
 **/
@Data
public class ConcartModel extends BaseRowModel {

    @ExcelProperty(value = "编号", index = 0)
    private Integer id;

    @ExcelProperty(value = "项目名称", index = 1)
    private String projectName;

    @ExcelProperty(value = "地址", index = 1)
    private String place;

}
