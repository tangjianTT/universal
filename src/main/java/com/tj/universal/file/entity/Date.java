package com.tj.universal.file.entity;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: David.Huang
 * @Date: 2019/12/20 0020 16:25
 */
@Data
public class Date {

    private String date;
    private List<TimeOrder> timeOrderList = new ArrayList<>();

    public Date(final String date, final List<TimeOrder> timeOrderList) {
        this.date = date;
        this.timeOrderList = timeOrderList;
    }
}
