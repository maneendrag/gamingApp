package com.example.games;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

//        context.getBean(GamingConsole.class).left();
//        context.getBean(GameRunner.class).run();

        context.getBean(PacmanGame.class).apply();

        context.getBean(GameRunner.class).run();

        System.out.println("Hellos");

//        var pacGame = new PacmanGame();
////        var marioGame = new MarioGame();
////        var superContraGame = new SuperContraGame();
//        var gameRunner = new GameRunner(pacGame);
//        gameRunner.run();

    }
}
