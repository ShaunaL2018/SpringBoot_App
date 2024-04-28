
  package com.bootPlay.bootPlay;
  
  import org.junit.jupiter.api.Test;
  
  import org.springframework.boot.test.context.SpringBootTest;
  import org.springframework.context.annotation.ComponentScan;
  
  @SpringBootTest 
  @ComponentScan(basePackages = {"com.bootPlay.controller, com.bootPlay.repository, "
			+ "com.bootPlay.service"})
  class BootPlayApplicationTests {
  
//  @Test 
//  void contextLoads() { }
//  
  }
 

