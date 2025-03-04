package com.JWT.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JWT.dto.DtoDepartment;
import com.JWT.dto.DtoEmployee;
import com.JWT.model.Department;
import com.JWT.model.Employee;
import com.JWT.repository.EmployeeRepository;
import com.JWT.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public DtoEmployee findEmployeeById(Long id) 
	{
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		Optional<Employee>  optional = employeeRepository.findById(id);
		
		if(optional.isEmpty())
		{
			return null;
		}
		
		Employee employee = optional.get();
		Department department = employee.getDepartment();
		
		BeanUtils.copyProperties(employee, dtoEmployee);
		BeanUtils.copyProperties(department, dtoDepartment);
		
		dtoEmployee.setDepartment(dtoDepartment);
		
		return dtoEmployee;		
		
	}

	
}
