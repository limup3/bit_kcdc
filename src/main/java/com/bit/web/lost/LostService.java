package com.bit.web.lost;

import java.util.List;

public interface LostService {

	public void add(Lost lost);

	public List<Lost> findAll();

}
