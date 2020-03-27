package com.mmi.convertcalcapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ConvertCalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertCalcApplication.class, args);
	}

@Bean
	public WebMvcConfigurer forwardToIndex() {
		return new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("redirect:/swagger-ui.html");
				registry.addViewController("/index.html").setViewName("redirect:/swagger-ui.html");
			}
		};
	}
}
