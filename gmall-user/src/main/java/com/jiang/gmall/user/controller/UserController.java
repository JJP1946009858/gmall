package com.jiang.gmall.user.controller;

import com.jiang.gmall.bean.UmsMember;
import com.jiang.gmall.service.UserService;
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
