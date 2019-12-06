package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Scanner scanner;
    private int compNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private void inputNumber(Player player, int j) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
        player.args(player.getNumber(), j);
    }

    private void compareNumbers(Player player, int j) {
        if (player.getNumber() > compNumber) {
            System.out.println("Ваше число больше, чем загаданное компьютером");
        } else if (player.getNumber() < compNumber) {
            System.out.println("Ваше число меньше, чем загаданное компьютером");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + (j + 1) + " попытки");
        }
    }

    private void arrayCount(int[] args, int j) {
        int[] arg = Arrays.copyOf(args, j + 1);                    //  Для считывания части массива используйте метод Arrays.copyOf
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] > 0) {
                System.out.print(arg[i] + " ");
            }
        }
    }

    private void arrayFill(int[] args) {
        for (int i = 0; i < args.length; i++) {                 //Для обнуления массивов игроков, при повторном запуске игры, используйте метод Arrays.fill().
            if (args[i] > 0) {                                    // При этом обнуляйте только те ячейки, где хранятся, названные игроками числа.
                Arrays.fill(args, i, i + 1, 0);
            }
        }
    }

    public void startGame() {
        scanner = new Scanner(System.in);
        compNumber = (int) (Math.random() * 101);
        int i = 0;

        while (i <= 9) {
            inputNumber(playerOne, i);
            compareNumbers(playerOne, i);
            if (playerOne.getNumber() == compNumber) {
                break;
            }
            inputNumber(playerTwo, i);
            compareNumbers(playerTwo, i);
            if (playerTwo.getNumber() == compNumber) {
                break;
            }
            i++;
        }
        if (i == 10) {
            System.out.println("У " + playerOne.getName() + " закончились попытки");
            System.out.println("У " + playerTwo.getName() + " закончились попытки");
        }

        arrayCount(playerOne.getArray(), i);
        System.out.println(" ");
        arrayCount(playerTwo.getArray(), i);
        System.out.println(" ");
        arrayFill(playerOne.getArray());
        arrayFill(playerTwo.getArray());
    }
}

