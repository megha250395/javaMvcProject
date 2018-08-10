package com.spring;
import java.util.*;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.servlet.ServletException;


@Controller
@SessionAttributes
public class LoginController {
	@Autowired
private UserValidator userValidator;
@RequestMapping(value="/verifyUser",method=RequestMethod.POST)
public String verifyUser(@ModelAttribute("user")User user,BindingResult result){
	System.out.println("verifyUser()");
	userValidator.validate(user,result);
	
	if(result.hasErrors()){
		System.out.println(result.getErrorCount());
		return "login";
	}
	//User user=(User) command;
	String un=user.getUsername();
	String pw=user.getPassword();
	System.out.println(un);
	System.out.println(pw);
	
	if(!un.equals(pw)){
	return "login";
}
	return "home";
}

@RequestMapping("/login")
public String showLoginFporm(Map model)throws ServletException{
	System.out.println("showLoginForm");
	User user=new User();
	user.setUsername("megha");
	model.put("user",user);
	return "login";
}
}
