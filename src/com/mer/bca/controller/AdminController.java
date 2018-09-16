package com.mer.bca.controller.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mer.bca.dto.LoginDTO;

@Controller
public class AdminController {
	
	@Value("${name}")
	private String name;
	@Value("${password}")
	private String password;
	
	@RequestMapping(value="adminLogin",method=RequestMethod.POST)
	public ModelAndView adminLogin(LoginDTO loginDTO) {
		
		String userName=loginDTO.getUserName();
		String pwd=loginDTO.getPassword();
		if(userName.equals(name) && pwd.equals(password)) {
			return new ModelAndView("adminhome.jsp");
		}
		else
		{
			return new ModelAndView("admin.jsp","message","userName or password is wrong");
		}
		
		
	}

}
