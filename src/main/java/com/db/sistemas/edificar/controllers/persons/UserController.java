package com.db.sistemas.edificar.controllers.persons;

import com.db.sistemas.edificar.domains.persons.entities.UserManager;
import com.db.sistemas.edificar.services.persons.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users-manager")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserManager> save(@RequestBody final UserManager userManager){
        return new ResponseEntity<>(userService.save(userManager), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserManager>> findAll(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
}
