package com.bootPlay.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootPlay.repository.H2Repository;

@Service
public class H2Service {
	
	@Autowired
	private H2Repository h2Repository;
	
	public H2Service(H2Repository repository) {
		h2Repository = repository;
	}
	
	public ArrayList<String> getAllH2Data(){
		
		ArrayList<String> h2Data = new ArrayList<String>();
		h2Data.add("Shauna");
		h2Data.add("Tristam");
		h2Data.add("Aven");
		
		return h2Data;
	}

}
