package com.jiang.gmall.user.controller;

import com.jiang.gmall.user.bean.UmsMember;
import com.jiang.gmall.user.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("fuck")
    public List<UmsMember> findAllUms(){
        return userService.findAllUms();

    }
}
