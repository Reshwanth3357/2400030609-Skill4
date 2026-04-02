package com.practice.SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Here we are creating a process of Dependency Injection
 * There are four types of Dependency Injections.
 * 1. Setter and Getter
 * 2. Constructor
 * 3. Annotation
 * 4. Interface
 * We used Setter, constructor and annotations
 */
/**
 * @Component is used to define a class a component
**/
@Component
public class App {
    public static void main(String[] args) {
    	
//    	Process is started
        System.out.println("Workingg...");
        /**
         * First we scanning the application configuration file where all the beans are stored
         * Then create a class object with respective to the bean id
         * Then print the object
        **/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
        
        Student studentCons = (Student) context.getBean("studentConsBean");        
        System.out.println(studentCons);
        
        /**
         * First we can the Configuration class we created that scans all the components present the project
         * We assign values to the variables in components
         * Create a class object 
         * Print the object*/
        
        ApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class); // Stores all the info of Config class
        
        Student studentConfig = (Student) config.getBean(Student.class); // Class details are stored
        System.out.println(studentConfig);
    }
}
