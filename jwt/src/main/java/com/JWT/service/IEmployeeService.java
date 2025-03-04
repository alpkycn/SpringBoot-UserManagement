package com.JWT.service;

import com.JWT.dto.DtoEmployee;

public interface IEmployeeService {

	DtoEmployee findEmployeeById(Long id);
}
