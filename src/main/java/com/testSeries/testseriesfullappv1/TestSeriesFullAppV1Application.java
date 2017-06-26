package com.testSeries.testseriesfullappv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class TestSeriesFullAppV1Application {

	public static void main(String[] args) {
		SpringApplication.run(TestSeriesFullAppV1Application.class, args);
	}
}
