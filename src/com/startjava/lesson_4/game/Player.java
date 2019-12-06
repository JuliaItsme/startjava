package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int number;
    private int[] arrayNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
    	return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
    	return number;
    }

	public int[] getArrayNumbers() {
        return arrayNumbers;
	}

	public void arrayFillNumber (int number, int i) {
        arrayNumbers[i] = number;
    }
}
