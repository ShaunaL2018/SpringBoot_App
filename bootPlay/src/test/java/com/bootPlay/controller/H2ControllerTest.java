package com.bootPlay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(classes=H2Controller.class)
@AutoConfigureMockMvc
class H2ControllerTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

//	@Autowired
//	private MockMvc mvc;

//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("Greetings from Spring Boot!")));
//	}
}

