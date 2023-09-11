package com.min.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FilterController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(String name ,Model model) {
		logger.info("home에 전달받은 param{}", name);
		model.addAttribute("name", name+"님 안녕하세요");
		return "home";
	}
	/*@RequestMapping(value = "/info.do", method = RequestMethod.POST)
	public String info(String name, int age) {
		logger.info("info에서 전달받은값 : {} {}", name,age);
		return "";*/
//	}
}
