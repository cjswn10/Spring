package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.DeptDAO;
import com.bit.vo.DeptVO;

@Controller
public class DeptController {
	private DeptDAO dao;
	
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listDept.do")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", dao.listAll());
		return mv;
	}
	
	@RequestMapping(value="/insertDept.do", method=RequestMethod.GET)
	public void insertForm() {
		//알아서 insertDept.jsp를 찾아가요
	}
	
	@RequestMapping(value="/insertDept.do", method=RequestMethod.POST)	
	public ModelAndView insertSubmit(DeptVO d) {
		ModelAndView mv = new ModelAndView("redirect:/listDept.do");
		//성공했을 경우 
		int re = dao.insert(d);
		if(re < 0) {
			mv.addObject("msg", "등록 실패");
			mv.setViewName("error");
		}
		return mv;
	}
	
	@RequestMapping("/detailDept.do")
	public ModelAndView detail(@RequestParam("dno")int dno) {
		ModelAndView mv = new ModelAndView("detailDept");
		mv.addObject("d", dao.detail(dno));
		return mv;
	}
	
	@RequestMapping(value="/updateDept.do", method=RequestMethod.GET)
	public ModelAndView updateForm(@RequestParam("dno")int dno) {
		ModelAndView mv = new ModelAndView("updateDept");
		mv.addObject("d", dao.detail(dno));
		return mv;
	}
	
	@RequestMapping(value="/updateDept.do", method=RequestMethod.POST)	
	public ModelAndView updateSubmit(DeptVO d) {
		ModelAndView mv = new ModelAndView("redirect:/listDept.do");
		//성공했을 경우 
		int re = dao.update(d);
		if(re < 0) {
			mv.addObject("msg", "수정 실패");
			mv.setViewName("error");
		}
		return mv;
	}
	
	@RequestMapping("/deleteDept.do")	
	public ModelAndView delete(@RequestParam("dno")int dno) {
		ModelAndView mv = new ModelAndView("redirect:/listDept.do");

		int re = dao.delete(dno);
		if(re < 0) {
			mv.addObject("msg", "수정 실패");
			mv.setViewName("error");
		}
		return mv;
	}
}
