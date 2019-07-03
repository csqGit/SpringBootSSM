package com.csq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csq.entity.Happiness;
import com.csq.service.HappinessService;

@RequestMapping("happinessController")
@Controller
public class HappinessController {
	
	@Autowired
	private HappinessService happinessService;

	//happinessController/selectHappinessByCity
	@RequestMapping("selectHappinessByCity")
	@ResponseBody
	public String selectHappinessByCity(String city) {
		Happiness happiness = happinessService.selectHappinessByCity(city);
		System.out.println("happiness: " + happiness);
		return "success";
	}
	
	
	@RequestMapping("insertHappiness")
	public String insertHappiness(String city, int num) {
		int result = happinessService.insertHappiness(city, num);
		System.out.println(result);
		return "success";
	}
}
