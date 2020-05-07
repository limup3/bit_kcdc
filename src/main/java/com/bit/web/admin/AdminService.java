package com.bit.web.admin;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component //타입처리
public interface AdminService {

	public void register(Admin admin);

	public List<Admin> findAll();

	public Admin findOne(String employNumber);

	public void modify(Admin admin);

	public void remove(Admin admin);

	
}
