package com.example.singinSevice.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "userSessions")
public class UserSessiions {

    private Long id;
    private String token;

    private Date expairedToken;

    @ManyToOne
    @JoinColumn(name = "accaunt_id")
    private Accaunt accaunt;

}
