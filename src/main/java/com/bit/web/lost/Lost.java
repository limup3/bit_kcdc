package com.bit.web.lost;

import lombok.Data;

@Data
public class Lost {

	private String lostid, acquired_item, acquired_date, acquired_classification, acquired_location;
}
