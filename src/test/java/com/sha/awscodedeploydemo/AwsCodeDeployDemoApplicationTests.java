package com.sha.awscodedeploydemo;

import com.sha.awscodedeploydemo.controller.ApiController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;

//@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = ApiController.class)
class AwsCodeDeployDemoApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldCreateUser() throws Exception {
		String createUserMessage = "User created";

		this.mockMvc.perform(get("/api/users"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("List of users {}")));
	}

}
