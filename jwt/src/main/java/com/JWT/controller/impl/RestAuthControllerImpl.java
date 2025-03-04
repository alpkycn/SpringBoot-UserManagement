package com.JWT.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JWT.controller.IRestAuthController;
import com.JWT.dto.DtoUser;
import com.JWT.jwt.AuthRequest;
import com.JWT.jwt.AuthResponse;
import com.JWT.jwt.RefreshTokenRequest;
import com.JWT.service.IAuthService;
import com.JWT.service.IRefreshTokenService;

import jakarta.validation.Valid;

@RestController
public class RestAuthControllerImpl implements IRestAuthController {

	@Autowired
	private IAuthService authService;
	
	@Autowired
	private IRefreshTokenService refreshTokenService;
	
	@PostMapping("/register")
	public DtoUser register(@Valid @RequestBody AuthRequest request)
	{
		return authService.register(request);
	}
	@PostMapping("/authenticate")
	@Override
	public AuthResponse authenticate(@Valid @RequestBody AuthRequest request) {

		return authService.authenticate(request);
	}
	
	@PostMapping("/refreshtoken")
	@Override
	public AuthResponse refreshToken(@RequestBody RefreshTokenRequest request) {
		return refreshTokenService.refreshToken(request);
	}
}
