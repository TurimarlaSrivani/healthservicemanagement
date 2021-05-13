package com.hsm.healthservicemanagement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2

public class Healthservicemanagement {

	Logger logger=LogManager.getLogger();
	
	public static void main(String[] args) {
		SpringApplication.run(Healthservicemanagement.class, args);
	
    }
	// Enable Swagger
	
	@Bean
    public Docket productApi() {
	    return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.cg.healthservicemanagementsystem")).build();
    }

}