package com.spring.spring_boot.dao;


import com.spring.spring_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
//    void add(User user);
//
//    User getUser(Long id);
//
//    List<User> getAll();
//
//    void delete(Long id);
//
//    void update(User user);
}
