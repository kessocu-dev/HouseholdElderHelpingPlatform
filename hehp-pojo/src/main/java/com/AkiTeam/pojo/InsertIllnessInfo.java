package com.AkiTeam.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class InsertIllnessInfo {

    @Schema(description = "老人名称")
    private String name;

    @Schema(description = "病情列表")
    private String illness;

    @Schema(description = "病情严重程度")
    private String stage;

}
