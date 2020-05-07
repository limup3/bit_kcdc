package com.bit.web.user;

import java.util.List;

public interface UserDao {

	public void insert(User user);

	public List<User> selectAll();

	public User selectOne(String userid);

	public User update(User user);

	public User delete(User user);

}
