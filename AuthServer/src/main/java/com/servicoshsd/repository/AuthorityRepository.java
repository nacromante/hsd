package com.servicoshsd.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.servicoshsd.model.Authority;


public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}