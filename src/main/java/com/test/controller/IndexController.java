package com.test.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.test.entity.User;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("host", "h");
		return "index";
		
	}
	
	@RequestMapping("/include")
	public String include(){
		return "include";
		
	}
	
	@RequestMapping("/hello")
	public @ResponseBody String greeting(){
		return "Hello World!";
	}
	
	@RequestMapping(value="/thymeleaf1")
	public ModelAndView thymeleaf(){
		ModelAndView model=new ModelAndView("thymeleaf1");
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=Calendar.getInstance();
		model.addObject("today", dateFormat.format(cal.getTime()));
		return model;
	}
	
	@RequestMapping(value="/thymeleaf2")
	public ModelAndView thymeleaf2() throws Exception{
		ModelAndView model=new ModelAndView("thymeleaf2");
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		User user=new User("155","zhangsan","123zxc", dateFormat1.parse("2009-06-01"));
        model.addObject("user", user);
		return model;
	}
	
	@RequestMapping(value="/thymeleaf3")
	public ModelAndView thymeleaf3() throws Exception{
		ModelAndView model=new ModelAndView("thymeleaf3");
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		User user=new User("155","zhangsan","123zxc", dateFormat1.parse("2009-06-01"));
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping(value="/thymeleaf4")
	public ModelAndView thymeleaf4() throws Exception{
		ModelAndView model=new ModelAndView("thymeleaf4");
		model.addObject("txtVar", "text");
		return model;
	}
	

	@RequestMapping(value="translateToChinese")
	public  @ResponseBody String translateToChinese(String para){
		
		return "中文意思："+para;
	}

	@RequestMapping(value="translateToEnglish")
	public  @ResponseBody String translateToEnglish(String para){
		
		return "英文意思："+para;
	}

}
