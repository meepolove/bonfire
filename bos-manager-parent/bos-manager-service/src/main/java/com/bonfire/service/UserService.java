package com.bonfire.service;

import com.bonfire.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/8/6.
 */
public interface UserService {
    List selectAll();
    User selectUserById(Integer id);
    void updateUserById(User user);
    void deleteUserById(Integer id);
}
