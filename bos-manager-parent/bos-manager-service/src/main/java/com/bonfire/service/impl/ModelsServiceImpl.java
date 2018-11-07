package com.bonfire.service.impl;

import com.bonfire.dao.ModelsMapper;
import com.bonfire.pojo.Models;
import com.bonfire.service.ModelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/9/27.
 */
@Transactional
@Service
public class ModelsServiceImpl implements ModelsService {
    @Autowired
    private ModelsMapper modelsMapper;
    @Override
    public List selectAll() {
        return modelsMapper.selectAll();
    }

    @Override
    public Models selectById(Integer id) {
        return modelsMapper.selectById(id);
    }
}
