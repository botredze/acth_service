package com.example.singinSevice.controllers;

import com.example.singinSevice.service.AccautnService;
import com.example.singinSevice.service.SignupSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class LoginController {

    @Autowired
    private AccautnService accautnService;

    @Autowired
    private SignupSevice signupSevice;

    @PostMapping("/login")
    public ResponseEntity login(@RequestParam String login , @RequestParam String password){
        return ResponseEntity.ok(accautnService.login(login,password));
    }

    @PostMapping("/signup")
    public ResponseEntity signup (@RequestParam  String login, @RequestParam String password){
        return ResponseEntity.ok(signupSevice.saveUser(login,password));
    }
}
