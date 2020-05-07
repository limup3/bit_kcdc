package com.bit.web.admin;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired AdminDao adminDao;
	
	@Override
	public void register(Admin admin) {
//		employNumber, passwd, name,
//	position, profile, email, phoneNumber, registerDate;
		
		admin.setEmployNumber(createEmployNumber()); // 4자리 랜덤
		admin.setPasswd("1");
		admin.setRegisterDate(createCurrentDate()); // 자바에서 현재날짜
		System.out.println("2. AdminServiceImpl register"+admin);
		adminDao.insert(admin);
	}

	private String createCurrentDate() {
		return new SimpleDateFormat ("yyyy년 MM월dd일").format(new Date());
	}

	private String createEmployNumber() {
//		 String startNum = "";
//	        for(int i=0;i < 4;i++) {
//	            startNum += String.valueOf((int)(Math.random()*10));
//	        }
//	        return startNum;
		
		
		return String.valueOf((int)(Math.random() * 9999)+1000);
	}

	@Override
	public List<Admin> findAll() {
		return adminDao.selectAll();		
	}

	@Override
	public Admin findOne(String employNumber) {
		return adminDao.selectOne(employNumber);
	}

	@Override
	public void modify(Admin admin) {
		adminDao.update(admin);
	}

	@Override
	public void remove(Admin admin) {
		adminDao.delete(admin);

	}


	

}
