package com.marbong.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marbong.springboot.service.MyService;

@RestController
@RequestMapping(value = "/")
public class MyController {

	@Autowired
    private MyService myService;
	
	@RequestMapping(value = "{firstName}/{lastName}", method = RequestMethod.GET)
	public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {

		return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);

	}

	@RequestMapping
    public String Hello(){
        return "hello " + myService.getName();
    }
	
}
