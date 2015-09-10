package vn.com.vhc.controller;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vhc.domain.User;
import vn.com.vhc.service.UserServiceLocal;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserServiceLocal userService;

	@RequestMapping("detail")
	public String helloworld(Integer id, Model model) {
		
		User user = userService.getByUserId(id);
		
		model.addAttribute("user", user);
		
		return "user/detail";
	}
	@RequestMapping("list")
	public String list( Model model) {
		
		List<User> userlist = userService.getAll();
		
		model.addAttribute("userlist", userlist);
		
		return "user/list";
	}
}
