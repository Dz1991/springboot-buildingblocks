package com.stacksimplify.restservices.conrollers;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){return userService.getAllUser();}

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id){return userService.getUserById(id);}

    @GetMapping("/users/byusername/{username}")
    public User getUserByUserName(@PathVariable("username") String userName){
        return userService.getUserByUsername(userName);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/users/{id}")
    public User updateUserById(@PathVariable("id") Long id, @RequestBody User user){
        return userService.updateUserById(id, user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
    }
}
