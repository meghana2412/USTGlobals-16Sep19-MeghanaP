package com.ustglobals.springmvcassessment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobals.springmvcassessment.dto.Product;
import com.ustglobals.springmvcassessment.dto.Retailer;
import com.ustglobals.springmvcassessment.service.RetailerService;

@Controller
public class RetailerController {
	
	@Autowired
	private RetailerService service;

	@GetMapping("/register")
	public String registerpage()
	{
		return "register";
	}//end of registerpage()

	@PostMapping("/register")
	public String register(Retailer bean, ModelMap map) {
		int check = service.register(bean);
		if(check>0)
		{
			map.addAttribute("msg","You are Registered and ID is : "+check);
		}
		else
		{
			map.addAttribute("msg", "Your not regestered with this site");
		}
		return "login";
	}//end of register()
	
	@GetMapping("/login")
	public String loginPage()
	{
		return "login";
	}

	@PostMapping("/login")
	public String login(int id, String password,HttpServletRequest request)
	{
		Retailer bean = service.login(id,password);

		if(bean==null)
		{
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}
		else
		{
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login
	
	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name = "bean", required= false) Retailer bean)
	{
		if(bean==null)
		{
			map.addAttribute("msg", "Login First!!!!");
			return "login";
		}
		else
		{
			return "home";
		}
	}// end of home()
	
	@PostMapping("/home")
	public String home()
	{
		return "home";
	}//end of home
	
	@GetMapping("/search")
	public String search(@RequestParam("id") int id,ModelMap map)
	{
		Product pbean = service.searchProduct(id);
		if(pbean==null)
		{
			map.addAttribute("msg", "Data not found");
		}
		else
		{
			map.addAttribute("bean", pbean);
		}
		return "home";
	}//end of search
	
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "login";
	}//end of loguot
	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		if(session!=null)
		{
			return "changepassword";
		}
		else
		{
			return "login";
		}
	}//end of changepassword()
	
	@PostMapping("/changepassword")
	public String changePassword(String password, String confirmpassword,
			@SessionAttribute(name="bean")Retailer bean,ModelMap map )
	{
		if(password.equals(confirmpassword))
		{
			service.updatePassword(bean.getId(), password);
			map.addAttribute("msg", "Password Changed");
		}
		else
		{
			map.addAttribute("msg", "Password not matching");
		}
		return "home";
	}	
	

}
