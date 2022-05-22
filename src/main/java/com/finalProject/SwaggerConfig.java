package com.finalProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig 
{
	@SuppressWarnings("deprecation")
	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(
				 new ApiInfo("IPTreatmentOffering Microservice", 
						 "This API Makes You Walk Through Different EndPoints",
						 "1.0.0",
						 "rohith@gmail.com",
						 "rohith", 
						 "All Rights Reserved",
						 "Open Source License.")
				 );
	}
}
