package dao;

import com.city.dao.mapper.UserMapper;
import com.city.dao.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: user类dao层测试
 * @DATE: 2018-05-25 10:56
 * @throws
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-dao.xml","classpath:spring-service.xml"})//加载配置文件
public class UserDaoTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserInsert(){
        User user = new User();
        user.setAge(10);
        user.setName("yangyang");

        userMapper.insert(user);
    }

}
