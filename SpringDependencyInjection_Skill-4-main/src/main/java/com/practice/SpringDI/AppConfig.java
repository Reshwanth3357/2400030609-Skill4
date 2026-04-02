package com.practice.SpringDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan annotation helps to scan all the components in a project
 * @Configuration annotation defines a POJO class a configuration file
 * @Bean helps to store the values as beans
**/

@Configuration
@ComponentScan("com.practice.SpringDI")
public class AppConfig {
	
	/**
	 * Here @Bean is used to store the return value of execution as bean and passed to Student.class constructor
	**/
	@Bean
    public Student student() {
        return new Student(102, "Ravi", "AI", 4);
    }
}
