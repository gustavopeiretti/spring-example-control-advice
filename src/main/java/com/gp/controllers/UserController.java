package com.gp.controllers;

import com.gp.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<String> create(@Valid @RequestBody User user) {
        return new ResponseEntity("ok", HttpStatus.OK);
    }

}
