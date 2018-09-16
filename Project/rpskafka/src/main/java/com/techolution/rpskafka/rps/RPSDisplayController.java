package com.techolution.rpskafka.rps;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/*
 * 	RPSDISPLAYCONTROLLER CLASS
 * 		simple class to start the rock-paper-scissors game
 */
@RestController
public class RPSDisplayController {

	
	/*
	 * 	HOME METHOD:
	 * 		display the index page on GET request
	 */
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView model = new ModelAndView("index");
		return model;
	}

}
