package com.city.service;

import com.city.dao.model.User;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: user接口
 * @DATE: 2018-05-25 11:22
 * @throws
 */
public interface UserService {

    int userAdd(User user);

    User queryUserById(int id);
}
