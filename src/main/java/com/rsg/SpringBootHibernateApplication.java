package com.rsg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableJpaAuditing
@EnableSwagger2
public class SpringBootHibernateApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootHibernateApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.regex("/api.*"))
				.build();
	}

/*
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/products").allowedOrigins("http://localhost:4200");
			}
		};
	}
*/
	/*@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {

			repository.save(new Customer("Umesh", "Awasthi","email@test.com"));
			repository.save(new Customer("David", "Dobrik", "email1@test.com"));
			repository.save(new Customer("Robert", "Hickle","r.k@email.com"));
			repository.save(new Customer("Edgar", "Smith","edgar@email.com"));

			// fetch all customers

			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
		};
	}*/
}




