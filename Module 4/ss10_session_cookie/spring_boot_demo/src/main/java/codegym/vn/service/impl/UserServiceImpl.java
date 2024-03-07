package codegym.vn.service.impl;

import codegym.vn.entity.User;
import codegym.vn.repository.UserRepository;
import codegym.vn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserByUserName(String username) {
        return userRepository.findById(username).orElse(null);
    }
}
