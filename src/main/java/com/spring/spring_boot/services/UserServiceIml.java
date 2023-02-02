package com.spring.spring_boot.services;

import com.spring.spring_boot.dao.UserRepository;
import com.spring.spring_boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceIml implements UserService {

    private final UserRepository userRepository;

    public UserServiceIml(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }


    @Override
    public User getUser(Long id) {

        return userRepository.findById(id).orElseThrow();
    }


    @Override
    public List<User> getAllUser() {

        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }



}
