package com.example.games;

public class PacmanGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Pac UP");
    }

    @Override
    public void down() {
        System.out.println("Pac down");
    }

    @Override
    public void left() {
        System.out.println("Pac Left");
    }

    @Override
    public void right() {
        System.out.println("Pac Right");
    }
}
