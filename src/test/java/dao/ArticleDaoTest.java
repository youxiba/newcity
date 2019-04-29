package dao;

import com.city.dao.mapper.ArticleMapper;
import com.city.dao.model.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description:测试文章类
 * @DATE: 2018-05-23 15:03
 * @throws
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-dao.xml","classpath:spring-service.xml"})//加载配置文件
public class ArticleDaoTest {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void testAticleInsert(){
        Article article = new Article();
        article.setAuthor("牛顿");
        article.setTitle("测试标题");
        article.setContent("这是文章内容");
        article.setCreatetime((int) System.currentTimeMillis());

        articleMapper.insert(article);
    }

}
