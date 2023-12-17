package com.cj.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "restaurant")
public class Guest implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String role;
}
