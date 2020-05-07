package com.bit.web.lost;

import java.util.List;

public interface LostDao {

	public void insert(Lost lost);
	
	public List<Lost> selectAll();
}
