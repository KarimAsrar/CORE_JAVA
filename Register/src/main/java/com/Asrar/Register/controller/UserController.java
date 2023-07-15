package com.Asrar.Register.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Asrar.Register.payload.UserDto;
import com.Asrar.Register.services.UserServiceImplementation;


@RestController
@CrossOrigin
@RequestMapping("api/v1/user")

public class UserController {   
	
	    @Autowired
	    private UserServiceImplementation userService;
	    @PostMapping(path = "/save")
	    public String saveEmployee(@RequestBody UserDto userDto)
	    {
	        String id = userService.addUser(userDto);
	        return id;
	    }

}


