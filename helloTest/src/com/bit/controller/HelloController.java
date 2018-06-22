package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "안녕 연주");
		mav.setViewName("hello");
		//view에 쓸 jsp파일 이름 .jsp는 쓰지 않는다
		return mav;
	}
}
