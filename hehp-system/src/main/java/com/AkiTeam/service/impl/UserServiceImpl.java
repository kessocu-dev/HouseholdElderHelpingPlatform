package com.AkiTeam.service.impl;

import com.AkiTeam.common.MessageConstant;
import com.AkiTeam.common.R;
import com.AkiTeam.config.LoginUser;
import com.AkiTeam.entity.User;
import com.AkiTeam.properties.JwtProperties;
import com.AkiTeam.service.UserService;
import com.AkiTeam.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public R login(User user) {
        //AuthenticationManager authenticate进行用户认证
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        //如果认证没通过，给出对应的提示（如果authenticate为null，则认证不通过）
        if (Objects.isNull(authenticate)) {
            throw new RuntimeException(MessageConstant.LOGIN_FAILED);
        }
        //如果认证通过了，使用userId生成一个jwt，jwt存入R返回
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        String userId = loginUser.getUser().getId().toString();
        String jwt = JwtUtil.createJWT(userId);
        Map<String,String> map = new HashMap<>();
        map.put("token", jwt);
        return new R(200,true,map,MessageConstant.LOGIN_SUCCESS);
    }
}
