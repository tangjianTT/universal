package com.tj.universal.file.entity;


import lombok.Data;

/**
 * @Author: David.Huang
 * @Date: 2019/12/20 0020 15:05
 */
@Data
public class TimeOrder {

    private String time;
    private String v1;
    private String v2;
    private String v3;

    public TimeOrder(final String time, final String v1, final String v2, final String v3) {
        this.time = time;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
}
