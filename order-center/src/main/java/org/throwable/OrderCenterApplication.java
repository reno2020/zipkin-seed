package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/18 22:08
 */
@SpringBootApplication
public class OrderCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderCenterApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setReadTimeout(5000);
		factory.setConnectTimeout(5000);
		restTemplate.setRequestFactory(factory);
		return restTemplate;
	}
}
