package com.jc.one.component.article.service.impl;

import com.jc.one.component.article.entity.Article;
import com.jc.one.component.article.mapper.ArticleMapper;
import com.jc.one.component.article.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author woolheia
 * @since 2018-10-05
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
