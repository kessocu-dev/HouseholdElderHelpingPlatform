package com.AkiTeam.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Tag(name = "账户密码信息表")
public class User {
    @Schema(description = "主键id")
    private Integer id;

    @Schema(description = "账号")
    private String username;

    @Schema(description = "密码")
    private String password;
}
