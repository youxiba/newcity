package service;

import com.city.dao.model.User;
import com.city.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: user类service层测试
 * @DATE: 2018-05-25 11:14
 * @throws
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-dao.xml","classpath:spring-service.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserInsert(){
       int count = userService.userAdd(new User("shanhai",34));
        System.out.println(count);
    }


    @Test
    public void testQueryUserById(){
        User user;
        user = userService.queryUserById(17);
        System.out.println("用户id"+user.getId());
        System.out.println("用户年龄"+user.getAge());
        System.out.println("用户名称"+user.getName());

    }
}
