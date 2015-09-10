package vn.com.vhc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	/**
	 * Mapping url /hello.html
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {

		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";		// return view
	}

}