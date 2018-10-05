package com.jc.one.common;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class BaseEntity {

    private String addOprid;

    private Date addDttm;

    private String updOprid;

    private Date updDttm;
}
