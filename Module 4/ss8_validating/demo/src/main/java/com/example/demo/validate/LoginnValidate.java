package com.example.demo.validate;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LoginnValidate implements Validator {
    @Autowired
    private LoginService service;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof Login)) {
            return;
        }
        Login login = (Login) target;
        if (service.findById(login.getId()) != null) {
            errors.rejectValue("id","id.duplicate","ID bị trùng lặp");
        }
    }
}
