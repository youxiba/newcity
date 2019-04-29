package com.city.service;

import com.city.dao.model.Article;

import java.util.List;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: article接口
 * @DATE: 2018-05-25 13:36
 * @throws
 */
public interface ArticleService {

    List<Article> queryArticleById(Integer id);

    int articleAdd(Article article);

    Article queryUserById(Integer id);


}
