package com.city.service.serviceimpl;

import com.city.dao.mapper.UserMapper;
import com.city.dao.model.User;
import com.city.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: 实现userservice
 * @DATE: 2018-05-25 11:24
 * @throws
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    /**
     * @Description:  添加用户
     * @Param:
     * @return:
     * @Author: Mr.MKB
     * @Date: 2018/5/25 11:34
     */
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public int userAdd(User user) {
        int count =userMapper.insert(user);
        System.out.println("userService userAdd 执行");
        return count;
    }

    /**
     * @Description: 由id查询用户信息
     * @Param:
     * @return:
     * @Author: Mr.MKB
     * @Date: 2018/5/25 11:36
     * @param id
     */
    @Override
    public User queryUserById(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println(user);
        return user;
    }
}
