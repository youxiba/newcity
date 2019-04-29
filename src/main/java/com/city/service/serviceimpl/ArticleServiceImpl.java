package com.city.service.serviceimpl;

import com.city.dao.mapper.ArticleMapper;
import com.city.dao.model.Article;
import com.city.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: 实现类
 * @DATE: 2018-05-25 13:46
 * @throws
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;




/*    public List<Borrow> queryBorrowList(Map<String, String> params) {

        return borrowDao.queryBorrowList(params);

    }*/



    @Override
    public List<Article> queryArticleById(Integer id) {

        return null;
    }

    @Override
    public int articleAdd(Article article) {
        return articleMapper.insert(article);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public Article queryUserById(Integer id) {
        Article article = articleMapper.selectByPrimaryKey(id);
        return article;
    }
}
