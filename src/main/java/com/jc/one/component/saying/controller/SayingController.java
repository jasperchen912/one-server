package com.jc.one.component.saying.controller;


import com.jc.one.common.BaseController;
import com.jc.one.component.article.entity.Article;
import com.jc.one.component.article.service.IArticleService;
import com.jc.one.component.saying.entity.Saying;
import com.jc.one.component.saying.service.ISayingService;
import com.jc.one.web.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author woolheia
 * @since 2018-10-05
 */
@RestController
@RequestMapping("/saying")
public class SayingController extends BaseController {

    private final ISayingService sayingService;

    @Autowired
    public SayingController(ISayingService sayingService) {
        this.sayingService = sayingService;
    }

    @RequestMapping(value = "/addBean.do")
    public Message.MessageEntry addBean(@RequestBody Saying saying) {
        return Message.ok(sayingService.save(saying));
    }
}
