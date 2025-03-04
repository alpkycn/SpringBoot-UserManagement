package com.JWT.controller;

import com.JWT.dto.DtoUser;
import com.JWT.jwt.AuthRequest;
import com.JWT.jwt.AuthResponse;
import com.JWT.jwt.RefreshTokenRequest;

public interface IRestAuthController {
	
	public DtoUser register(AuthRequest request);

	public AuthResponse authenticate(AuthRequest request);

	public AuthResponse refreshToken(RefreshTokenRequest request);
}
