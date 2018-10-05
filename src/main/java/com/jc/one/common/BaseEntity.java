package com.jc.one.common;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    private String addOprid;

    private Date addDttm;

    private String updOprid;

    private Date updDttm;
}
