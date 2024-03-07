package codegym.vn.service;

import codegym.vn.entity.User;

public interface UserService {
    User getUserByUserName(String username);
}
