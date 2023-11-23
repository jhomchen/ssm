package com.jh.ssm.dao;

import com.jh.ssm.pojo.User;

public interface UserMapper {
    
    public User selectByPrimaryKey(int userId);

}