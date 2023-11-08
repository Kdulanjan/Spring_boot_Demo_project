package com.example.springboot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v/user")
@CrossOrigin

public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "test_Root";
    }

    @PostMapping("/SaveUser")
    public String SaveUser(){
        return "Save_Root";
    }
    @PutMapping("/UpdateUser")
    public String UpdateUser(){
        return "Update_Root";
    }
    @DeleteMapping("/DeleteUser")
    public String DeleteUser(){
        return "Delete_Root";
    }
}
