package com.jc.one.component.saying.entity;

import java.time.LocalDateTime;
import java.util.Date;

import com.jc.one.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author woolheia
 * @since 2018-10-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Saying extends BaseEntity {

    private static final long serialVersionUID = 5749267788099200467L;

    private String content;

    private String author;

    private String imgUrl;

    private String type;

    private String addOprid;

    private Date addDttm;

    private String updOprid;

    private Date updDttm;

    private String status;


}
