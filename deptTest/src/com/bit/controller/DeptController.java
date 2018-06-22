package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.DeptDAO;

@Controller
public class DeptController {
	private DeptDAO dao;
	
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listDept.do")
	public ModelAndView mv() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list", dao.listAll());
		mv.setViewName("listDept");
		return mv;
	}
}
