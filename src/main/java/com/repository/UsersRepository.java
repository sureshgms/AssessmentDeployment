package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	public Optional<Users> findByEmailId(String emailId);

}
