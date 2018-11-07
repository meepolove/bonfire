package com.bonfire.service;

import com.bonfire.pojo.Models;

import java.util.List;

/**
 * Created by Administrator on 2018/9/27.
 */
public interface ModelsService {
    List selectAll();
    Models selectById(Integer id);
}
