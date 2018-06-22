package com.bit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NowController {
	
	@RequestMapping("/now.do")
	public ModelAndView now() {
		ModelAndView mv = new ModelAndView();
		
		Date d = new Date();
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		String[] yoil = {"��", "��", "ȭ", "��", "��", "��", "��"};
		String day = yoil[d.getDay()];
		
		int h = d.getHours();
		int m = d.getMinutes();
		int s = d.getSeconds();
		
		String str = year + "�� " + month + "�� " + date + "�� (" + day + ") " + h + ":" + m + ":" + s; 
		mv.addObject("now", str);
		mv.setViewName("now");
		return mv;
	}
}
