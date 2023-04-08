package com.zacharydaniels.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

        public static void main(String[] args) {
            // Launch a Spring Context
                var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

            // Configure the things we want Spring to manage - @Configuration
                // HelloWorldConfiguration class -@Configuration
                // name method - @Bean

                // Retrieves Beans managed by Spring
                System.out.println(context.getBean("name"));

                System.out.println(context.getBean("age"));

                System.out.println(context.getBean("person"));

                System.out.println(context.getBean("address2"));

                System.out.println(context.getBean(Address.class));

        }
}
