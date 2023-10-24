package com.AkiTeam.mapper;

import com.AkiTeam.pojo.InsertIllnessInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface user_elder_illnessMapper {
    // 通过病人姓名批量插入病情
    void InsertIllnessByInfo(@Param("info") List<InsertIllnessInfo> info);
}
