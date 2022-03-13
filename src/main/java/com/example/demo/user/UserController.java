package com.example.demo.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    List<User> getUsers(){
        return  userService.getUsers();
    }

    @PostMapping()
    User adduser (@RequestBody User user){
    return userService.addUser(user);
    }

    @GetMapping("/{id}")
    User getUser(@PathVariable Long id){
     return userService.getUser(id);
    }

}
