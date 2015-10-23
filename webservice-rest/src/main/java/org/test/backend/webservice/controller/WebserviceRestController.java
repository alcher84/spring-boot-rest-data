package org.test.backend.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.test.backend.entity.Users;
import org.test.backend.services.UsersService;

/**
 * Created by achernysh on 22.10.2015.
 */
@RestController
@RequestMapping("/WebserviceRest")
public class WebserviceRestController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public
    @ResponseBody
    String helloWorld() {
        return "Hello, World";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@RequestParam String username, @RequestParam String password) {
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        usersService.save(user);
        return "Success";
    }
}
