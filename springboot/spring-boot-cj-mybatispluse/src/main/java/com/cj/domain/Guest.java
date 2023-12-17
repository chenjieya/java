package com.cj.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@TableName("restaurant")
public class Guest implements Serializable {

    private Integer id;
    private String name;
    private String role;
}
