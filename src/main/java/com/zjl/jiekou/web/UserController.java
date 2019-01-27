package com.zjl.jiekou.web;

import com.zjl.jiekou.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userr")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get")
    public String getUserByUserName(@RequestParam String username){
        System.out.println(" canshu:"+username);
        String pwd=userService.getUserPwd(username);
        return pwd;
    }
}
