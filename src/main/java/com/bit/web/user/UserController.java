package com.bit.web.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.web.admin.Admin;
import com.bit.web.util.Messenger;

@RestController
@RequestMapping("users") // com.occamsrazor.web.member
public class UserController {

	@Autowired UserService userService;
	
	@PostMapping("")
	public Messenger post(@RequestBody User user) {
		
		userService.add(user);
		
		return Messenger.SUCCESS;
	}
	
	@GetMapping("")
	public List<User> list() {
		return userService.findAll();
	}
	
	@GetMapping("/{userid}")
	public User	detail(@PathVariable String userid) {
		return userService.findOne(userid);
	}
	
//	@PutMapping("/{userid}")
//	public User update(User user) {
//		return userService.modify(user);
//	}
//	
//	@DeleteMapping("/{userid}")
//	public User delete(User user) {
//		return userService.remove(user);
//	}
	
	
	
}
