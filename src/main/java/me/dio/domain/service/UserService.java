package me.dio.domain.service;

import me.dio.domain.model.User;


public interface UserService {

    User findByID (Long id);
    User create(User userToCreate);

}
