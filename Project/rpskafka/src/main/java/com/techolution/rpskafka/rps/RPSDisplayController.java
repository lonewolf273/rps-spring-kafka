package com.techolution.rpskafka.rps;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RPSDisplayController {

	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView model = new ModelAndView("index");
		return model;
	}

}
