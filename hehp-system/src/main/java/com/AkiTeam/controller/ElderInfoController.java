package com.AkiTeam.controller;

import com.AkiTeam.entity.user_elder_info;
import com.AkiTeam.service.impl.ElderInfoServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "老人信息登记模块")
@RequestMapping("/elderInfo")
public class ElderInfoController {
    @Autowired
    private ElderInfoServiceImpl elderInfoService;

    @PostMapping("/returnAllInfo")
    @Operation(summary = "返回所有老人信息")
    public List<user_elder_info> returnAllInfo(){
        return elderInfoService.GetAllElderInfo();
    }
}
