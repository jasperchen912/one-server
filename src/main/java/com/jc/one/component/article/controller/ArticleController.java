package com.jc.one.component.article.controller;


import com.jc.one.component.article.entity.Article;
import com.jc.one.component.article.service.IArticleService;
import com.jc.one.web.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.jc.one.common.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author woolheia
 * @since 2018-10-05
 */
@RestController
@RequestMapping("/article")
public class ArticleController extends BaseController {

    @Autowired
    private IArticleService articleService;

    @RequestMapping(value = "/addBean.do")
    public Message.MessageEntry addBean(@RequestBody Article article) {
        return Message.ok(articleService.save(article));
    }
}
