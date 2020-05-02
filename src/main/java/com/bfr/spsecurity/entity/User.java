package com.bfr.spsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "User")
public class User {

    @Id
    private long id;

    @Column
    private String username;

    @Column
    private String password;
}
