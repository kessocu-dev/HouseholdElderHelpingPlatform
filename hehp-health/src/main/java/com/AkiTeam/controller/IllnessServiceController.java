package com.AkiTeam.controller;

import com.AkiTeam.common.R;
import com.AkiTeam.pojo.InsertIllnessInfo;
import com.AkiTeam.service.impl.IllnessServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "老人病情模块")
@RequestMapping("/illnessService")
public class IllnessServiceController {
    @Autowired
    private IllnessServiceImpl illnessService;

    @PostMapping("/insertInfoByName")
    @Operation(summary = "通过老人姓名批量插入病情")
    R<Object> insertIllnessByName(@RequestBody List<InsertIllnessInfo> info){
        illnessService.InsertIllnessByEach(info);
        return R.status(true);
    }

}
