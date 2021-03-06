package com.testSeries.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Configuration
public class APIConfig {

	@Bean
	public ObjectMapper objectMapper(){
		return new ObjectMapper();
	}
	
	@Bean
	public ObjectWriter objectWriter(ObjectMapper mapper){
		return mapper.writerWithDefaultPrettyPrinter();
	}
}
