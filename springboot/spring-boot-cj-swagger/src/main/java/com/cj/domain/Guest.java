package com.cj.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "嘉宾信息")
public class Guest {
    @Schema(description = "姓名", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
    @Schema(description = "角色", requiredMode = Schema.RequiredMode.REQUIRED)
    private String role;

}
