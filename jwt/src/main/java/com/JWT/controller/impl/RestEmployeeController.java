package com.JWT.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JWT.controller.IRestEmployeeController;
import com.JWT.dto.DtoEmployee;
import com.JWT.service.IEmployeeService;


@RestController
@RequestMapping(path =  "/employee")
public class RestEmployeeController implements IRestEmployeeController{

	@Autowired
	private IEmployeeService employeeService;
	
	
	@GetMapping(path = "/{id}")
	@Override
	public DtoEmployee findEmployeeById(@PathVariable(value = "id") Long id) {
		return employeeService.findEmployeeById(id);
	}

	
}
