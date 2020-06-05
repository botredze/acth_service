package com.example.singinSevice.service.impl;

import com.example.singinSevice.exeptions.InCorrectPassword;
import com.example.singinSevice.exeptions.NoSuchUser;
import com.example.singinSevice.models.Accaunt;
import com.example.singinSevice.reposıtory.AccauntRepository;
import com.example.singinSevice.service.AccautnService;
import com.example.singinSevice.service.UserSesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccautnServiceImpl implements AccautnService {
    @Autowired
    private UserSesionService userSesionService;


    @Autowired
    private AccauntRepository accauntRepository;


    @Override
    public String login(String login, String password) {
        Accaunt accaunt= accauntRepository.findByLogin(login);

        if(accaunt==null){
            throw new NoSuchUser("Пользователь не найден  !");
    }

        if(!accaunt.getPassword().equals(password)){
           throw  new InCorrectPassword("Не верный пароль");
        }

        String token = userSesionService.getToken();
        userSesionService.saveUserSesion(accaunt,token);
        return token;
    }
}
