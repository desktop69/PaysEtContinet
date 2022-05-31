package com.saad.pays.service;

import java.util.List;

import com.saad.pays.entities.User;



public interface UsersService {
    List<User> findAll();
    
    User saveUser(User u);
    User updateUser(User u);
    void deleteUser(User u);
     void deleteUserById(Long id);
     User getUser(Long idUser);

}
