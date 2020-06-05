package com.example.singinSevice.service;

import com.example.singinSevice.models.Accaunt;

public interface SignupSevice {

    Accaunt saveUser(String login, String password);
}
