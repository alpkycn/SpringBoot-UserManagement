package com.JWT.service;

import com.JWT.jwt.AuthResponse;
import com.JWT.jwt.RefreshTokenRequest;

public interface IRefreshTokenService {

	public AuthResponse refreshToken(RefreshTokenRequest request);
}
