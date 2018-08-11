package com.bonfire.service.impl;

import com.bonfire.dao.UserMapper;
import com.bonfire.pojo.User;
import com.bonfire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/8/6.
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;

    @Override
    public List selectAll() {
        return (List)userDao.selectAll();
    }

    @Override
    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    public void updateUserById(User user) {
        userDao.updateUserById(user);
    }

    public void deleteUserById(Integer id) {
        userDao.deleteUserById(id);
    }
}
