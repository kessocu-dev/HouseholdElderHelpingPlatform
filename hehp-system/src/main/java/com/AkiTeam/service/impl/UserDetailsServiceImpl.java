package com.AkiTeam.service.impl;

import com.AkiTeam.common.MessageConstant;
import com.AkiTeam.config.LoginUser;
import com.AkiTeam.entity.User;
import com.AkiTeam.mapper.userMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private userMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查询用户信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername, username);
        User user = userMapper.selectOne(queryWrapper);
        //如果没有查询到用户就抛出异常
        if (Objects.isNull(user)) {
            throw new RuntimeException(MessageConstant.ACCOUNT_PASSWORD_MISMATCHING);
        }
        //TODO 查询对应的权限信息

        //把数据封装成UserDetails返回
        return new LoginUser(user);
    }
}
