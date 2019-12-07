package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return attempts;
    }

    public int getAttempts(int i) {
        return attempts[i];
    }

    public void addAttempt(int number, int i) {
        attempts[i] = number;
    }
}
