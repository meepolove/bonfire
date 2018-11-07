package com.bonfire.controller;

import com.alibaba.fastjson.JSON;
import com.bonfire.pojo.Models;
import com.bonfire.pojo.PageResponse;
import com.bonfire.service.ModelsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/9/27.
 */
@Controller
@RequestMapping(value = "models")
public class ModelsController {
    @Autowired
    private ModelsService modelsService;

    @RequestMapping(value = "getAll")
    public String getAll(Model model){
        List<Models> list = modelsService.selectAll();
        //for(Models models:list){
            //System.out.println(models.getCreatedAt());
        //}
        model.addAttribute("models",list);
        return "models";
    }

    @RequestMapping(value = "getOne")
    public Models getOne(@RequestParam Integer id){
        Models models = modelsService.selectById(id);
        System.out.println(models.toString());
        return models;
    }

    @RequestMapping(value = "getAllByPageHelp")
    //@ResponseBody
    public @ResponseBody String getAllByPageHelp(@RequestParam(required = false, defaultValue = "1") Integer pageNumber,
                            @RequestParam(required = false, defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber, pageSize);
        List<Models> modelses =  modelsService.selectAll();
        PageInfo<Models> pi = new PageInfo<Models>(modelses);
        PageResponse pageResponse = new PageResponse();
        pageResponse.setTotal((int)pi.getTotal());
        pageResponse.setRows(modelses);
        System.out.println(pi);
        String result = JSON.toJSONString(pageResponse);
        System.out.println(result);
        return result;
    }
}
