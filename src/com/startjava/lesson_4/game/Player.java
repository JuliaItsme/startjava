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

    public void addAttempt(int number, int i) {
        attempts[i] = number;
    }

    public int extractAttempt(int [] args, int i) {
        int j = args[i];
        return j;
    }
}
