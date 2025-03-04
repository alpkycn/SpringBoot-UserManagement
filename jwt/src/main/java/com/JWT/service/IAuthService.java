package com.JWT.service;

import com.JWT.dto.DtoUser;
import com.JWT.jwt.AuthRequest;
import com.JWT.jwt.AuthResponse;

public interface IAuthService {

	public DtoUser register(AuthRequest request);
	
	public AuthResponse authenticate(AuthRequest request);
}
