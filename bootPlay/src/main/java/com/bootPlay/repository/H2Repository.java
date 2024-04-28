package com.bootPlay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootPlay.entity.Employee;

@Repository
public interface H2Repository extends JpaRepository <Employee, Long>  {
	
	

}
