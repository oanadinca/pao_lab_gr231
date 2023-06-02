package com.pao.coffeeshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pao.coffeeshop.service.BaristaService;

@ComponentScan("com.pao.coffeeshop")
@Configuration
public class ServiceComponentConfig {
	@Bean
	public BaristaService baristaService() {return new BaristaService();};
}
