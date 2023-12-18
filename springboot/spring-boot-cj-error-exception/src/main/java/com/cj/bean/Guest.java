package com.cj.bean;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guest {
    @NotBlank(message = "名字不能为空")
    private String name;
    @NotBlank
    private String role;
}
