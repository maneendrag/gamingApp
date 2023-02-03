package com.example.games.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){

        //1: Launch Spring

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2: configure for Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("customperson"));
        System.out.println(context.getBean(Person.class));



    }
}
