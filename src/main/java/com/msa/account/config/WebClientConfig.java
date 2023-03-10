package com.msa.account.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
	
	@Value("${my-service.reserve.host}")
	private String reserveHost;
	
	@Value("${my-service.reserve.port}")
	private String reservePort;

	@Bean
	WebClient webClient() {
		return WebClient.builder()
				.baseUrl("http://"+this.reserveHost+":"+this.reservePort)
				.build();
	}
}
