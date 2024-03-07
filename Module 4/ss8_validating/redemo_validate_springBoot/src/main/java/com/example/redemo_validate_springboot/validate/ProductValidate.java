package com.example.redemo_validate_springboot.validate;

import com.example.redemo_validate_springboot.entity.Product;
import com.example.redemo_validate_springboot.service.ProductService;
import jakarta.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;

public class ProductValidate implements Validator {
    @Autowired
    private ProductService service;
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(!(target instanceof Product)){
            return;
        }
        Product p=(Product) target;
        if(service.findById(p.getId())!= null){
            errors.rejectValue("id","id.duplicate","ID bị trùng lặp");
        }
        if(p.getDateRealase()==null){
            errors.rejectValue("dataRelease","date.empty","Ngày không hợp lệ");
        } else if(p.getDateRealase().before(new Date())){
            errors.rejectValue("dataRelease","date.invalid","Ngày không hợp lệ");
        }

    }

    @Override
    public Errors validateObject(Object target) {
        return Validator.super.validateObject(target);
    }
}
