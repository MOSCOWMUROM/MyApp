package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@PropertySource(value = "classpath:hibernate.properties")
@ComponentScan(basePackages = "org.example")
public class ApplicationConfiguration {
}
