package com.example.singinSevice.service.impl;

import com.example.singinSevice.exeptions.AccauntOlReadyExist;
import com.example.singinSevice.models.Accaunt;
import com.example.singinSevice.reposıtory.AccauntRepository;
import com.example.singinSevice.service.SignupSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupSeviceImpl implements SignupSevice {

    @Autowired
    private AccauntRepository accauntRepository;

    @Override
    public Accaunt saveUser(String login, String password) {
        Accaunt accaunt= accauntRepository.findByLogin(login);


        if(accaunt !=null){
            throw new AccauntOlReadyExist("Пользователь с таким логином уже существует");
        }else{
            accaunt = new Accaunt();
            accaunt.setLogin(login);
            accaunt.setPassword(password);
            accaunt.setActive(true);

            accaunt= accauntRepository.save(accaunt);
        }
        return accaunt;
    }
}
