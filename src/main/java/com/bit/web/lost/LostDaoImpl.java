package com.bit.web.lost;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.web.util.Data;

@Repository
public class LostDaoImpl implements LostDao {

	@Override
	public void insert(Lost lost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Lost> selectAll() {
		List<Lost> lostlist = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try {
			File file = new File(Data.LOST_PATH+"list.csv");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
			while((message = reader.readLine()) != null) {
				list.add(message);
				
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("파일 출력시 에러 발생");
		}
		Lost l = null;
		for (int i = 0; i < list.size(); i++) {
			l = new Lost();
			String[] arr = list.get(i).split(",");
			l.setLostid(arr[0]);
			l.setAcquired_item(arr[1]);
			l.setAcquired_date(arr[2]);
			l.setAcquired_classification(arr[3]);
			l.setAcquired_location(arr[4]);
			lostlist.add(l);
		}
		
		return lostlist;
	}
	
	

	
	
}
