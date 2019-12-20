package com.jiang.gmall.user.service.impl;

import com.jiang.gmall.user.bean.UmsMember;
import com.jiang.gmall.user.mapper.UmsMybatis;
import com.jiang.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UmsMybatis umsMybatis;

    @Override
    public List<UmsMember> findAllUms() {
        List<UmsMember> list=umsMybatis.findAllUms();
        return list;
    }
}
