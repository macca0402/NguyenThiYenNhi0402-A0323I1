package org.example.service;

import org.example.model.Email;

import java.util.List;

public interface EmailService {
    Email displayInfo(int id);
    void update(Email email);
    List<Email> list();
}
