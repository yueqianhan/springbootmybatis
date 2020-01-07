package com.bjsxt.springbootmybatis.service.impl;

import com.bjsxt.springbootmybatis.mapper.UserMapper;
import com.bjsxt.springbootmybatis.pojo.User;
import com.bjsxt.springbootmybatis.pojo.UserExample;
import com.bjsxt.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hanyueqian
 * @date 2020/1/5 0005-下午 20:47
 */
@Service
public class UserServiceImpl implements UserService
{
    /**
     * 添加用户
     */
    @Autowired
    private UserMapper userMapper;
    @Override
    @Transactional
    public void addUser(User user)
    {
        this.userMapper.insert(user);
    }

    /**
     * 显示所有用户
     * @return
     */
    @Override
    public List<User> showUser()
    {
        UserExample example =new UserExample();
        return this.userMapper.selectByExample(example);
    }

    /**
     * 预更新
     * @param id
     * @return
     */
    @Override
    public User preUpdate(String id)
    {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void modifyUser(User user)
    {
         this.userMapper.updateByPrimaryKey(user);
    }

    @Override
    @Transactional
    public void deleteUser(String uid)
    {
        this.userMapper.deleteByPrimaryKey(uid);
    }
}
