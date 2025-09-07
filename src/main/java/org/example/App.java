package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.bpp.TransactionBeanPostProcessor;
import org.example.config.ApplicationConfiguration;
import org.example.database.ConnectionPool;
import org.example.models.Company;
import org.example.repository.CompanyRepository;
import org.example.repository.CrudRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.html.parser.Entity;
import java.util.List;


/**
 * Hello world!
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        var companyRepository = context.getBean("companyRepository", CrudRepository.class);
        System.out.println(companyRepository.findById(1L));
    }
}
