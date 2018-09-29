package com.jc.one.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public class Article {

    @Setter
    @Getter
    private String id;

    @Setter
    @Getter
    private String title;

    @Setter
    @Getter
    private String content;

    @Setter
    @Getter
    private String author;

    @Setter
    @Getter
    private String submitDate;

}
