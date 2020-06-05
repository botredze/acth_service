package com.example.singinSevice.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accaunts")
public class Accaunt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String password;
    private boolean active;
}
