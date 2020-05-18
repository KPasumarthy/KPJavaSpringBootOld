package com.kpjavaspringboot.controller;

import java.util.List;

//import com.kpjavaspringboot.entity.User;
//import com.kpjavaspringboot.repository.UserRepository;
//import com.kpjavaspringboot.service.UserService;

import org.springframework.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/user")
	public String retrieve() {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : UserController - @GetMapping");
		return "HTTP://GET : RETRIEVE : Sri Sita Rama Hanuman";
	}
	
	@PostMapping("/user")
	public String create(@RequestBody String user) {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : UserController - @PostMapping : " + user);
		return "HTTP://POST : CREATE : " + user;
	}
	
	@PutMapping("/user")
	public String update(@RequestBody String user) {	
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : UserController - @PutMapping : " + user);	
		return "HTTP://PUT : UPDATE : " + user;
	}	

	@DeleteMapping("/user")
	public String delete(@RequestBody String user) {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : UserController - @DeleteMapping : " + user);
		return "HTTP://DELETE : DELETE : " + user;
	}		
}
