package org.example.config;

import org.example.database.pool.ConnectionPool;
import org.example.database.repository.CompanyRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@PropertySource(value = "classpath:hibernate.properties")
@ComponentScan(basePackages = "org.example")
@Configuration(proxyBeanMethods = true)//для CGLIB
public class ApplicationConfiguration {
    @Bean
    ConnectionPool connectionPool1 (){
        return new ConnectionPool("2","4", "url");
    }
    @Bean
    CompanyRepository companyRepository(){
        var c1 = connectionPool1();
        var c2 = connectionPool1();
        var c3 = connectionPool1();
        return new CompanyRepository(connectionPool1());
    }
}
