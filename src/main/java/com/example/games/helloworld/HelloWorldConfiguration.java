package com.example.games.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
        public String  name(){
        return "Maneendra";
    }

    @Bean
        public int  age(){
        return 22;
    }

    @Bean(name = "customperson")
    public Person person(){
        var prsn = new Person("Hary",22);
        return prsn;
    }


}
