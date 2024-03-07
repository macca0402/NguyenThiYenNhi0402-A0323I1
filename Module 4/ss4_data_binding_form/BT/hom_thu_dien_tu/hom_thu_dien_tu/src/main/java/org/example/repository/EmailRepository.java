package org.example.repository;

import org.example.model.Email;
import java.util.List;
public interface EmailRepository {
    Email displayInfo(int id);
   void update(Email email);
    List<Email> list();
}
