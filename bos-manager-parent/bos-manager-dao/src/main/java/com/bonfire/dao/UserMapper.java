package com.bonfire.dao;

import com.bonfire.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/8/6.
 */
@Repository
public interface UserMapper {

    List<User> selectAll();
    //通过ID查询客户
    User selectUserById(Integer id);
    //修改客户通过ID
    void updateUserById(User user);

    //通过ID 删除客户
    void deleteUserById(Integer id);
}
