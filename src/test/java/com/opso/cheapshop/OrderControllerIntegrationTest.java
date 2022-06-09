package com.opso.cheapshop;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = CheapshopApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderControllerIntegrationTest {
	
	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();

	@Test
	public void TestGetOrderbyId() throws JSONException {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/api/orders/2"),
				HttpMethod.GET, entity, String.class);

		String expected = 
				"{\"id\":2,\"purchase_date\":\"2025-10-22T22:23:34.000+00:00\",\"delivery_address\":\"los patriotas 2042\",\"delivery_date\":\"2027-08-10 18:47:9\",\"quantity\":1,\"userId\":2,\"productId\":1}";
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}

		
	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
	
	
	
	
}
