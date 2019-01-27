package com.zjl.jiekou.service.impl;

import com.zjl.jiekou.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    public String getUserPwd(String username){
        if(username.equals("fzp")){
            return "fzp123";
        }else {
            return  "123456";
        }
    }
}
