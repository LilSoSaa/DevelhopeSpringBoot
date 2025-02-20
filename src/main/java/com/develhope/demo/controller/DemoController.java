package com.develhope.demo.controller;

import com.develhope.demo.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/saluto")
    public String getInfo() {
        return "Hello World!";
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserDTO> createUser (@RequestBody UserDTO userData) {
        return new ResponseEntity<>(userData, HttpStatus.CREATED);
    }

}
