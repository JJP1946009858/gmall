package com.jiang.gmall.user.service.impl;


import com.jiang.gmall.bean.UmsMember;
import com.jiang.gmall.service.UserService;
import com.jiang.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> findAllUms() {
        List<UmsMember> list=userMapper.selectAll();
        return list;
    }
}
