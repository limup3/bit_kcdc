package com.bit.web.user;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.web.util.Data;

@Repository // 기능만 정의
public class UserDaoImpl implements UserDao {

	@Override
	public void insert(User user) {
		try {
			
		} catch (Exception e) {

		}
		
	}

	@Override
	public List<User> selectAll() {
		List<User> userlist = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try {
			File file = new File(Data.USER_PATH+"list.csv");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
			while((message = reader.readLine()) != null) {
				list.add(message);
				
			}
			System.out.println(list);
			reader.close();
		} catch (Exception e) {
			System.out.println("파일 출력시 에러 발생");
		}
		User u = null;
		for (int i = 0; i < list.size(); i++) {
			u = new User();
			String[] arr = list.get(i).split("\t");
			u.setUserid(arr[0]);
			u.setPasswd(arr[1]);
			u.setName(arr[2]);
			u.setSsn(arr[3]);
			u.setAddr(arr[4]);
			u.setProfile(arr[5]);
			u.setEmail(arr[6]);
			u.setPhoneNumber(arr[7]);
			u.setRegisterDate(arr[8]);
			userlist.add(u);
		}
		
		return userlist;
	}

	@Override
	public User selectOne(String userid) {
		List<User> list = selectAll();
		User findUser = null;
		for(User u : list) {
			if(userid.equals(u.getUserid())) {
				findUser = u;
				break;
			}
		}
		return findUser;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
