package org.example.service;

import org.example.model.Email;
import org.example.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private EmailRepository emailRepository;

    @Override
    public Email displayInfo(int id) {
        return emailRepository.displayInfo(id);
    }

    @Override
    public void update(Email email) {
        emailRepository.update(email);

    }

    @Override
    public List<Email> list() {
        return emailRepository.list();
    }
}
