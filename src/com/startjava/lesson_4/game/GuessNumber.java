package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;


    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private void arrayCount(int[] args, int i) {
        int[] arg = Arrays.copyOf(args, i); //  Для считывания части массива используйте метод Arrays.copyOf
        for (int j = 0; j < arg.length; j++) {
            if (arg[j] > 0) {
                System.out.print(arg[j] + " ");
            }
        }
        System.out.println(" ");
    }

    public void arrayFill(int[] args) {
        for (int i = 0; i < args.length; i++) {                 //Для обнуления массивов игроков, при повторном запуске игры, используйте метод Arrays.fill().
            if (args[i] > 0) {                                    // При этом обнуляйте только те ячейки, где хранятся, названные игроками числа.
                Arrays.fill(args, i, i + 1, 0);
            }
        }
    }

    private void playing(int[] args, Player player, Scanner sc, int comNum, int j) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(sc.nextInt());
        args[j] = player.getNumber();

        if (player.getNumber() > comNum) {
            System.out.println("Ваше число больше, чем загаданное компьютером");
        } else if (player.getNumber() < comNum) {
            System.out.println("Ваше число меньше, чем загаданное компьютером");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + comNum + " с " + (j + 1) + " попытки");
        }
    }

    public void guessingNumber() {
        Scanner scanner = new Scanner(System.in);
        int compNumber = (int) (Math.random() * 101);
        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[10];
        int i = 1;
        int j = 0;

        while (i <= 10) {
            playing(arrayOne, playerOne, scanner, compNumber, j);
            if (playerOne.getNumber() == compNumber) {
                break;
            }
            playing(arrayTwo, playerTwo, scanner, compNumber, j);
            if (playerTwo.getNumber() == compNumber) {
                break;
            }
            j++;
            i++;
        }
        if (i > 10) {
            System.out.println("У " + playerOne.getName() + " закончились попытки");
            System.out.println("У " + playerTwo.getName() + " закончились попытки");
        }


        arrayCount(arrayOne, i);
        arrayCount(arrayTwo, i);
        arrayFill(arrayOne);
        arrayFill(arrayTwo);
    }
}

