//usage of RequestMapping and GetMapping

package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;

/*mport org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.model.User;*/
@Controller
public class UserController {
	//using requestParam
	@RequestMapping("/hello")
	public String display(@RequestParam("userId")int userId,@RequestParam("userName")String userName,@RequestParam("password")String password,Model m)
	{
		String msg="Hello: "+userName;
		m.addAttribute("message",msg);
		return "viewpage";
	}
	@GetMapping("/path/{alias}/{alias1}")
	public String welcome1(@PathVariable("alias")int userId,@PathVariable("alias1")String userName,Model model)
	{
		String msg="Hello: "+userName;
		model.addAttribute("message",msg);
		return "viewpage";
	}
		/*ApplicationContext applicationContext=new ClassPathApplicationContext();
		User user=(User) applicationContext.getBean("user");
		user.setUserId(userId);
		user.setUserName(userName);
		((ClassPathApplicationContext)applicationContext).close();
		model.addAttribute(arg0)
	}*/
	/*@PostMapping(value="/login")
	public ModelAndView loginFunction(@ModelAttribute User user )
	{userName
	//System.out.println(user.getUserName());
	ModelAndView modelandView=new ModelAndView("success");
	modelandView.addObject("key2",user);
	return modelandView;
	}*/
}
