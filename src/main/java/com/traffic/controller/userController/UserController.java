package com.traffic.controller.userController;

import com.traffic.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/web")
    public ResponseEntity<String> createForm(@RequestParam String name,
                                             @RequestParam String info){
        return ResponseEntity.ok(userService.createFormService(name,info));
    }
}
