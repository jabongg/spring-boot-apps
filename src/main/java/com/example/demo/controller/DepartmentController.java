package com.example.demo.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
	private static Logger logger = Logger.getLogger(DepartmentController.class.getName());
	
	@Autowired
	private DepartmentService service;
	
	
	@PostMapping("/")
	@ResponseBody
	public Department save(@RequestBody Department department) {
		logger.info("inside DepartmentController : save department method");
		return service.saveDeparetment(department);
		
	}
	
	@GetMapping
	@ResponseBody
	public Department getDepartmentById(@RequestParam Long departmentId) {
		
		logger.info("inside DepartmentController : getDepartmentById method");
		return service.getDeparetment(departmentId).get();
	}

	/**
	 * get all the departments
	 * @param departmentId
	 * @return
	 */
	@GetMapping("/")
	@ResponseBody
	public List<Department> getAllDepartments() {
		
		logger.info("inside DepartmentController : getAllDepartments method");

		return service.getAllDeparetment();
	}
}
