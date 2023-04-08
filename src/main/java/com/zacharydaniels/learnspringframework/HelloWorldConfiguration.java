package com.zacharydaniels.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Zach";
    }

    @Bean
    public int age() {
        return 38;
    }

    @Bean
    public Person person() {
        return new Person("Daniels", 20);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("123 Main St", "New York");
    }
}
