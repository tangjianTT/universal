package com.tj.universal.file.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author TJ
 * @description TODO
 * @date 2021/4/9 16:14
 **/
@Data
public class Concart {
    private Integer id;

    private String projectName;

    private String place;

    public Concart(final Integer id, final String projectName, final String place) {
        this.id = id;
        this.projectName = projectName;
        this.place = place;
    }
}
