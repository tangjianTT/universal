package com.tj.universal.jwt.service;

import com.tj.universal.jwt.entity.SysUser;
import com.tj.universal.jwt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TJ
 * @description TODO
 * @date 2021/1/18 10:25
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public SysUser getUserInfoByLoginName(final String account) {
        return userMapper.getUserInfoByLoginName(account);
    }

}
