package com.AkiTeam.service;

import com.AkiTeam.pojo.InsertIllnessInfo;

import java.util.List;

public interface IllnessService {
    void InsertIllnessByEach(List<InsertIllnessInfo> info);
}
