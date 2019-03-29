package cn.ssm.web;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.dao.UserDao;
import cn.ssm.domain.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/view")
	public String view() {
		return "main/login";
	}
	
	@RequestMapping("/indexview")
	public String index() {
		return "main/index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("name")String userName, @RequestParam("passWord")String passWord,HttpServletRequest request) {
		User user = userDao.findByUserName(userName);
		
		System.out.println(user.getPassWord().equals(passWord));
		ModelAndView mv = new ModelAndView();
		if (user == null || !user.getPassWord().equals(passWord)) {
			mv.setViewName("redirect:/login.jsp");
		} else {
			mv.setViewName("index");
			mv.addObject("user", user);
		}
		return mv;
	}
}
