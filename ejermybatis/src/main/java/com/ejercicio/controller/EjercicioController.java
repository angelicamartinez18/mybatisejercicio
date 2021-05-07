package com.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ejercicio.model.Employee;
import com.ejercicio.service.EmployeeService;

@Controller
public class EjercicioController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping(value= { "/index"}, method = RequestMethod.GET)
	public String getIndex() {
		return "index";
	}
	
	
	@RequestMapping(value= { "/employeelist"}, method = RequestMethod.GET)
	public String getEmployeeList(Model model) {
		List<Employee> employeeList = employeeService.findEmployee();
		model.addAttribute("employeeList", employeeList);
		
		return "employeelist";
	}
	
	//comentario
	
	
	
}
