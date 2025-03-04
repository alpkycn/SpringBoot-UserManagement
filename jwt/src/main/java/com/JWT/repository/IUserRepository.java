package com.JWT.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.JWT.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

  //@Query(value = "from User where username = :username")
	Optional<User> findByUsername(String username);

}
