package com.example.games;

public class App01GamingBasicJava {
    public static void main(String args[]){

        var pacGame = new PacmanGame();
//        var marioGame = new MarioGame();
//        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(pacGame);
        gameRunner.run();

    }
}
