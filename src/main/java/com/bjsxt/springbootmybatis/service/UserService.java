package com.bjsxt.springbootmybatis.service;

import com.bjsxt.springbootmybatis.pojo.User;

import java.util.List;

/**
 * @author hanyueqian
 * @date 2020/1/5 0005-下午 20:46
 */
public interface UserService
{
    void addUser(User user);
    List<User> showUser();
    User preUpdate(String id);
    void modifyUser(User user);
    void deleteUser(String uid);
}
