package com.ts.SpringBootProject40.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.SpringBootProject40.entities.User;

public interface UserRepo extends JpaRepository <User,Integer >{
	

}
