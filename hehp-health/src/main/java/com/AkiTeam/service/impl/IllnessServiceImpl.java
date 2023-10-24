package com.AkiTeam.service.impl;

import com.AkiTeam.mapper.user_elder_illnessMapper;
import com.AkiTeam.pojo.InsertIllnessInfo;
import com.AkiTeam.service.IllnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllnessServiceImpl implements IllnessService {
    @Autowired
    private user_elder_illnessMapper userElderIllnessMapper;
    @Override
    public void InsertIllnessByEach(List<InsertIllnessInfo> info) {
        // TODO: 因单引号和大括号的解析问题 使用了${}字符串拼接逻辑 有可能有sql注入风险
        userElderIllnessMapper.InsertIllnessByInfo(info);
    }
}
