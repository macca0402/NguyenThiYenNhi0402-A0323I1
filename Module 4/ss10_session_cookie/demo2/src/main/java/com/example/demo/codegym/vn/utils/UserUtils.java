package com.example.demo.codegym.vn.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class UserUtils {
    public  String generatePassword(String password){
        String bcryptHashString= BCrypt.withDefaults().hashToString(12,password.toCharArray());
        return bcryptHashString;

    }
    public boolean checkPassword(String hashPassword,String rawPassword){
        BCrypt.Result result=BCrypt.verifyer().verify(rawPassword.toCharArray(),hashPassword);
        return result.verified;
    }

    public static void main(String[] args) {
        UserUtils utils=new UserUtils();

        System.out.println(utils.generatePassword("123456"));
        if(utils.checkPassword("$2a$12$3wIddSJY3MaN73vmILsjFuFDcnVRxsjxgxr70FLrJZpL.azrYiaPi","123456")){
            System.out.println("Password correct");
        } else{
            System.out.println("Password incorrect");
        }


    }
}

