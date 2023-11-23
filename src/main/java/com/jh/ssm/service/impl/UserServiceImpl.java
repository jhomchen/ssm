package com.jh.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.ssm.dao.UserMapper;
import com.jh.ssm.pojo.User;
import com.jh.ssm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
    @Autowired
    private UserMapper userMapper;

    public User getUserById(int userId) {
    	
        return userMapper.selectByPrimaryKey(userId);
    }

}