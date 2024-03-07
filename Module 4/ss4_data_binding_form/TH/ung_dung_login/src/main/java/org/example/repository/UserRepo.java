package org.example.repository;

import org.example.model.Login;
import org.example.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepo {
    private static List<User> users;
    static {
        users= new ArrayList<>();
        User u1= new User();
        u1.setAge(10);
        u1.setName("John");
        u1.setAccount("john");
        u1.setEmail("john@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u3= new User();
        u3.setAge(16);
        u3.setName("Mike");
        u3.setAccount("mike");
        u3.setEmail("mike@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }
    public static User checkLogin(Login login){
        for(User u: users){
            if(u.getAccount().equals(login.getAccount()) &&
            u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
