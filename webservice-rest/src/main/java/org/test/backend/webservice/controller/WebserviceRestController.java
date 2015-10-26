package org.test.backend.webservice.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.web.bind.annotation.*;
import org.test.backend.entity.Users;
import org.test.backend.services.UsersService;
import org.test.backend.webservice.transfer.HelloDto;

/**
 * Created by achernysh on 22.10.2015.
 */
@RestController
@RequestMapping(value = "/WebserviceRest")
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


    @RequestMapping(value = "/helloName", method = RequestMethod.GET)
    public
    @ResponseBody String helloName(@RequestParam(value="name", defaultValue="My Lord") String name) {
        return "Hello, " + name;
    }

    @RequestMapping(value = "/helloJson", method = RequestMethod.GET)
     @Produces("application/json")
     public HttpEntity<HelloDto> helloJson() throws JSONException{
        HelloDto hello = new HelloDto();
        hello.setId(1L);
        hello.setMessage("Hi, babe");

        return ResponseEntity.ok(hello);
    }

}
