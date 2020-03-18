package com.huyhoangEsport.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public ModelAndView homePage()
	{
		ModelAndView mvn = new ModelAndView("admin/home");
		return mvn;
	}
}