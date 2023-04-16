/**
 * 
 */
package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.example.controller.SubscriptionController;

/**
 * @author vartika.gupta
 *
 */

@WebMvcTest(SubscriptionController.class)
public class SubscriptionTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {

		String subscriptionJson = "{\"name\":\"John\",\"email\":\"John25@gmail.com\",\"userType\":\"dev\",\"company\":\"walmart\",\"applicationType\":\"web\"}";
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/subscription")
				.accept(MediaType.APPLICATION_JSON).content(subscriptionJson)
				.contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();

		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}
}
