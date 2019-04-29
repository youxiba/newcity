package service;

import com.city.dao.model.Article;
import com.city.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: article-service层测试
 * @DATE: 2018-05-25 13:35
 * @throws
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-dao.xml","classpath:spring-service.xml"})
public class ArticleServiceTest {
    @Autowired
    private ArticleService articleService;

    @Test
    public void testArticleInsert(){
        Article article = new Article();
        article.setCreatetime((int) (System.currentTimeMillis()/1000));
        article.setContent("这是衣蛾不三十十九拉得开发了疯");
        article.setAuthor("NILL");
        article.setTitle("test");

        int count = articleService.articleAdd(article);

        System.out.println("检查插入时间问题");
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println((int)(System.currentTimeMillis()/1000));

        if(count==1){
            System.out.println("插入数据陈宫");
            System.out.println("===========");
        }else{
            System.out.println("插入数据失败");
        }

    }


}
