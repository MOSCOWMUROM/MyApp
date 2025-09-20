package org.example;

import org.example.database.repository.CrudRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        var companyRepository = context.getBean("companyRepository", CrudRepository.class);
        System.out.println(companyRepository.findById(1L));
    }
}
