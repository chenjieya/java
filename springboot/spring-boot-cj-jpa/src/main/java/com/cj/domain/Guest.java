package com.cj.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name = "restaurant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest implements Serializable {

    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String role;
}
