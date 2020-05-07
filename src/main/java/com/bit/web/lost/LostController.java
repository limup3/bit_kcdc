package com.bit.web.lost;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.web.util.Messenger;

@RestController
@RequestMapping("/losts")
public class LostController {
	
	@Autowired LostService lostService;

	@PostMapping("")
	public Messenger post(@RequestBody Lost lost) {
		
		lostService.add(lost);
		
		return Messenger.SUCCESS;
	}
	
	@GetMapping("")
	public List<Lost> list() {
		return lostService.findAll();
	}

}
