package org.couchpotato.rentanything.controller;

import java.util.List;

import org.couchpotato.rentanything.model.User;
import org.couchpotato.rentanything.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public List<User> getAll(){		
		return (List<User>) userRepository.findAll();
	}
}
