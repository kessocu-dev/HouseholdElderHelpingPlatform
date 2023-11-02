package com.AkiTeam.mapper;

import com.AkiTeam.entity.user_elder_info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface user_elder_infoMapper {

    List<user_elder_info> GetAllElderInfo();

}
