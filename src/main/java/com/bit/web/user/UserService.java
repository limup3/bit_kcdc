package com.bit.web.user;

import java.util.List;

public interface UserService {

	public void add(User user);

	public List<User> findAll();

	public User findOne(String userid);

	public User modify(User user);

	public User remove(User user);
	
}
