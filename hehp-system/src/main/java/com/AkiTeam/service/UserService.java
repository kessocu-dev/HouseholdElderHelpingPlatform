package com.AkiTeam.service;

import com.AkiTeam.common.R;
import com.AkiTeam.entity.User;

public interface UserService {
    /**
     * 登录
     * @param user
     * @return
     */
    public R login(User user);

}
