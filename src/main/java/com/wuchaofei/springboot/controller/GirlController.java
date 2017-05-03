package com.wuchaofei.springboot.controller;

import com.wuchaofei.springboot.entity.Girl;
import com.wuchaofei.springboot.dao.GirlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by cofco on 2017/5/3.
 */
@Controller
public class GirlController {

    @Autowired
    private GirlDao girlDao;

    /**
     * 查询所有女生列表
     * @return
     */
    @RequestMapping(value = "/girls",method = RequestMethod.GET)
    public List<Girl> getGirlList() {
        return girlDao.findAll();
    }

    /**
     * 添加一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @RequestMapping(value = "/girls",method = RequestMethod.POST)
    public Girl addGirl(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlDao.save(girl);
    }
}
