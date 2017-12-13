package com.sxt.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.sxt.entity.Condition;
import com.sxt.entity.Emp;
import com.sxt.entity.Student;
import com.sxt.service.EmpService;
import com.sxt.service.impl.StudentServiceImpl;

@Controller
public class EmpController  {
    
	@Resource(name="empService")
	private EmpService empService;
	
	@RequestMapping("/emp.action")
	public String insertEmps(Emp emp){
		
		empService.addEmp(emp);		
		return "redirect:selectEmps.action";
	}
	
	@RequestMapping("/selectEmps.action")
	public String selectEmps(Model model){
		
		List<Emp> list=empService.selectEmps();
		model.addAttribute("emps", list);
		return "showEmps.jsp";
				
	}
	
	@RequestMapping("/removeEmp.action")
	public String removeEmp(Integer empNo){
		
		empService.removeEmp(empNo);
		return "redirect:selectEmps.action";
	}
	
	
	@RequestMapping("/removeEmps.action")
	public String removeEmps(int[] empNos){
		
		empService.removeEmps(empNos);
		return "redirect:selectEmps.action";
		
	}
	
	@RequestMapping("/selectEmpsByCondition.action")
	public String selectEmpsByCondition(Condition condition,Model model){
				
		List<Emp> emps=empService.selectEmpsByCondition1(condition);
		model.addAttribute("emps", emps);
		
		return "showEmps.jsp";
	}
	
	@RequestMapping("/updateEmps.action")
	public String updateEmps(Emp emp){
		
		empService.updateEmps(emp);
		return "selectEmps.action";		
	}
	
	
//	@RequestMapping("/validate.action")
//	public void selectEmpByName(String ename,HttpServletResponse response) throws Exception{
//		
//		response.setContentType("text/json;charset=utf-8");
//		Emp emp=empService.selectEmpByName(ename);
//		JSONObject json=JSONObject.fromObject(emp);
//		
//		response.getWriter().print(json.toString());
//		response.getWriter().flush();
//		response.getWriter().close();
//		System.out.println(json);
//		
//	}
	
	@RequestMapping("/validate.action")
	public @ResponseBody Emp selectEmpByName(String ename,HttpServletResponse response) throws Exception{
		
		response.setContentType("text/json;charset=utf-8");
		 Emp emp=empService.selectEmpByName(ename);
		 if(emp==null){
			 return new Emp();
		 }
		 
		 return emp;
		
	}

}
