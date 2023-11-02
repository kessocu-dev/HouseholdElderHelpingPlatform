package com.AkiTeam.service.impl;

import com.AkiTeam.entity.user_elder_info;
import com.AkiTeam.mapper.user_elder_infoMapper;
import com.AkiTeam.service.ElderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElderInfoServiceImpl implements ElderInfoService {

    @Autowired
    private user_elder_infoMapper userElderInfoMapper;

    @Override
    public List<user_elder_info> GetAllElderInfo() {
        return userElderInfoMapper.GetAllElderInfo();
    }
}
