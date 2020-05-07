package com.bit.web.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.web.user.User;
import com.bit.web.util.Data;
import com.bit.web.util.Messenger;

@Repository // 기능만 정의
public class AdminDaoImpl implements AdminDao {

	@Override
	public void insert(Admin admin) {
		System.out.println("3. AdminServiceImpl register");
		try {
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(
									new FileWriter(
									new File(Data.ADMIN_PATH.toString()+Data.LIST+Data.CSV),true));
			writer.write(admin.toString());
			writer.newLine();
			writer.flush();
			System.out.println("4. File Input Success");
		} catch (Exception e) {
			System.out.println(Messenger.FILE_WRITE_ERROR.toString());
		}
		
	}

	@Override
	public List<Admin> selectAll() {
		List<Admin> adminlist = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try {
			File file = new File(Data.ADMIN_PATH+"list.csv");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
			while((message = reader.readLine()) != null) {
				list.add(message);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("파일 출력시 에러 발생");
		}
		Admin u = null;
		for (int i = 0; i < list.size(); i++) {
			u = new Admin();
			String[] arr = list.get(i).split(",");
			u.setEmployNumber(arr[0]);
			u.setPasswd(arr[1]);
			u.setName(arr[2]);
			u.setPosition(arr[3]);
			u.setProfile(arr[4]);
			u.setEmail(arr[5]);
			u.setPhoneNumber(arr[6]);
			u.setRegisterDate(arr[7]);
			adminlist.add(u);
		}
		
		return adminlist;
	}

	@Override
	public Admin selectOne(String employNumber) {
		Admin admin = null;
		try {
			
		} catch (Exception e) {

		}finally {
			
		}
		return admin;
	}

	@Override
	public void update(Admin admin) {
		try {
			
		} catch (Exception e) {

		}finally {
			
		}


	}

	@Override
	public void delete(Admin admin) {
		try {
			
		} catch (Exception e) {

		}finally {
			
		}

		
	}

}
