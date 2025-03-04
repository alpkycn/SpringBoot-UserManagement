package com.JWT.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JWT.model.RefreshToken;

@Repository
public interface IRefreshTokenRepository extends JpaRepository<RefreshToken, Long>{
	
  //@Query(value = "from RefreshToken r WHERE r.refreshToken = :refreshToken")
	Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
