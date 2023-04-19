package com.db.sistemas.edificar.services;

import com.db.sistemas.edificar.domains.persons.UserManager;
import com.db.sistemas.edificar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserManager save(final UserManager userManager){
        return userRepository.save(userManager);
    }

    public List<UserManager> findAll(){
        return userRepository.findAll();
    }
}
