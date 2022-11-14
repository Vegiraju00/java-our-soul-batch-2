package com.example.AmazonStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.AmazonStore.model.Devices;

@Controller
public class StoreController {
	Devices result;//=new Devices();
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}	
	
	@RequestMapping("/samsung")
	public ModelAndView samsung()
	{
		ModelAndView mv=new ModelAndView("samsung");
		RestTemplate rt=new RestTemplate(); 
		result=rt.getForObject("http://localhost:8084/samsung/devices", Devices.class);
		mv.addObject("devices",result);
		return mv;
	}	
	@RequestMapping("/apple")
	public ModelAndView apple()
	{
		ModelAndView mv=new ModelAndView("apple");
		RestTemplate rt=new RestTemplate(); 
		result=rt.getForObject("http://localhost:8085/apple/devices", Devices.class);
		mv.addObject("devices",result);
		return mv;
	}
	
	

}
