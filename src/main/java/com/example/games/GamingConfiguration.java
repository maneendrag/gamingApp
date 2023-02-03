package com.example.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class GamingConfiguration {

    @Bean
    @Primary
    public GamingConsole game(@Qualifier("pacQualifier") PacmanGame pacmanGame){
//        var game1 = new PacmanGame();
        return pacmanGame;
    }

//    public GamingConsole game3(){
//        var game1 = new PacmanGame();
//        return game1;
//    }\

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    @Bean
    @Qualifier("pacQualifier")
    public PacmanGame pacmanGame(){
        var pac = new PacmanGame();
        return pac;
    }

}
