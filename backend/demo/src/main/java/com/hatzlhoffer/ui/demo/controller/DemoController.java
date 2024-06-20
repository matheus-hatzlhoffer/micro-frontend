package com.hatzlhoffer.ui.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcomeMessage(){
        return new ResponseEntity<>("Welcome from the server", HttpStatus.OK);
    }
}
