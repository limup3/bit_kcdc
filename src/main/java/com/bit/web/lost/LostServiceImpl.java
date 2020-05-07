package com.bit.web.lost;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LostServiceImpl implements LostService {

	@Autowired LostDao lostDao;
	
	@Override
	public void add(Lost lost) {
		lostDao.insert(lost);
		
	}

	@Override
	public List<Lost> findAll() {
		return lostDao.selectAll();
	}

}
