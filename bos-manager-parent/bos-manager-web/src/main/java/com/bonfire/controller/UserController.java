package com.bonfire.controller;

import com.bonfire.pojo.User;
import com.bonfire.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/8/6.
 */
@Controller
@RequestMapping(value = "dept")
public class UserController {
    @Autowired
    private UserService userService;

    //去修改页面

    @RequestMapping(value = "getAll")
    public String edit(Model model){
        List<User> list = userService.selectAll();
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping(value = "/user/{page]")
    public User edit(Integer page){
        return userService.selectUserById(page);
    }
    //修改保存
//    @RequestMapping("/user/update.action")
//    @ResponseBody
//    public  String update(User user){
//        userService.updateUserById(user);
//        return "OK";
//    }
    //删除
//    @RequestMapping("/user/delete/{id}")
//    public  String delete(Integer id){
//        userService.deleteUserById(id);
//        return "OK";
//    }
}
