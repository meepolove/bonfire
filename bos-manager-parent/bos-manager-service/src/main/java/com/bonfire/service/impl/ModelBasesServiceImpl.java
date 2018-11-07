package com.bonfire.service.impl;

import com.bonfire.dao.ModelBasesMapper;
import com.bonfire.service.ModelBasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/9/27.
 */
@Transactional
@Service
public class ModelBasesServiceImpl implements ModelBasesService {
    @Autowired
    private ModelBasesMapper modelBasesMapper;
    @Override
    public List selectAll() {
        return modelBasesMapper.selectAll();
    }
}
