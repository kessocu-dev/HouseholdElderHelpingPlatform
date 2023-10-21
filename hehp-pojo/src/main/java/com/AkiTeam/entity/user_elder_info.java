package com.AkiTeam.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

import java.util.Date;

@Data
@Tag(name = "老人基础信息表")
public class user_elder_info {
    @Schema(name = "主键id")
    private Integer id;

    @Schema(name = "老人名称")
    private String name;

    @Schema(name = "老人电话号码")
    private String phone;

    @Schema(name = "老人身份证")
    private String idcard;

    @Schema(name = "老人家人联系方式")
    private String family_phone;

    @Schema(name = "老人实际住址")
    private String location;

    @Schema(name = "注册时间")
    private Date date;
}
