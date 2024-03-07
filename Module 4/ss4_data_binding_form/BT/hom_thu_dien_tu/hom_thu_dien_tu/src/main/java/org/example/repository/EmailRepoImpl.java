package org.example.repository;

import org.example.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepoImpl implements EmailRepository{
    private static List<Email> list;
    static {
        list= new ArrayList<>();
        list.add(new Email(1,"English",25,false,"Thor King,Asgard"));
        list.add(new Email(2,"Vietnamese",25,true,"Thor King,Asgard"));
    }

    @Override
    public Email displayInfo(int id) {
        for (Email e:list
             ) {
            if(e.getCode()==id){
                return e;
            }

        }
        return null;
    }

    @Override
    public void update(Email e) {
        for (Email email:list
             ) {
            if(email.getCode()==e.getCode()){
                list.set(list.indexOf(email),e);
            }
        }
    }

    @Override
    public List<Email> list() {
        return list;
    }
}
