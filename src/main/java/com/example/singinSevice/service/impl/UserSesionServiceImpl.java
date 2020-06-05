package com.example.singinSevice.service.impl;

import com.example.singinSevice.models.Accaunt;
import com.example.singinSevice.models.UserSessiions;
import com.example.singinSevice.reposıtory.UserSesionRepository;
import com.example.singinSevice.service.UserSesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.UUID;

@Service
public class UserSesionServiceImpl implements UserSesionService {

    @Autowired
    private UserSesionRepository userSesionRepository;

    @Override
    public String getToken() {
        return UUID.randomUUID().toString();
    }

    @Override
    public void saveUserSesion(Accaunt accaunt,String token) {
        UserSessiions userSessiions= new UserSessiions();
        userSessiions.setAccaunt(accaunt);
        userSessiions.setToken(token);
        Calendar calendar=Calendar.getInstance();
        calendar.add(calendar.MINUTE, 5);


        userSessiions.setExpairedToken(calendar.getTime());
        userSesionRepository.save(userSessiions);
    }
}
