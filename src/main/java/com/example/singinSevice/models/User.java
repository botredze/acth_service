package com.example.singinSevice.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String name;

    @OneToOne
    @JoinColumn(name = "accaunt_id")
    private Accaunt accaunt;

}
