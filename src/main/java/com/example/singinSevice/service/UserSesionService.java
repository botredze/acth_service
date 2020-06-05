package com.example.singinSevice.service;

import com.example.singinSevice.models.Accaunt;

public interface UserSesionService {


    String getToken();
    void saveUserSesion(Accaunt accaunt, String token );
}
