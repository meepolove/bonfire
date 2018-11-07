package com.bonfire.dao;

import com.bonfire.pojo.Models;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/9/27.
 */
@Repository
public interface ModelsMapper {
    List<Models> selectAll();
    Models selectById(Integer id);
}
