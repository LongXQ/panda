package com.longxiongqiu.moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MoonApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MoonApplication.class, args);
	}

//	private final CityMapper cityMapper;
//
//	public MoonApplication(CityMapper cityMapper) {
//		this.cityMapper = cityMapper;
//	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MoonApplication.class);
	}


//	@Bean
//	CommandLineRunner sampleCommandLineRunner() {
//		return args -> {
//			City city = new City();
//			city.setId(0L);
//			city.setName("San Francisco");
//			city.setState("CA");
//			city.setCountry("US");
//			cityMapper.insert(city);
//			System.out.println(this.cityMapper.findById(city.getId()));
//		};
//	}


}
