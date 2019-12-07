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

    public void startGame() {
        scanner = new Scanner(System.in);
        compNumber = (int) (Math.random() * 101);
        int i;
        for (i = 0; i <= 9; i++) {
            if (!makeMove(playerOne, i)) {
                break;
            } else if (!makeMove(playerTwo, i)) {
                break;
            }
        }

        if (i == 10) {
            System.out.println("У " + playerOne.getName() + " закончились попытки");
            System.out.println("У " + playerTwo.getName() + " закончились попытки");
        }

        showNumbers(playerOne.getAttempts(), i);
        showNumbers(playerTwo.getAttempts(), i);
        fill(playerOne.getAttempts(), i);
        fill(playerTwo.getAttempts(), i);
    }

    private boolean makeMove(Player player, int i) {
        inputNumber(player, i);
        compareNumbers(player, i);
        return playerOne.getAttempt(i) != compNumber;
    }

    private void inputNumber(Player player, int i) {
        System.out.print(player.getName() + ", введите число: ");
        player.addAttempt(scanner.nextInt(), i);
    }

    private void compareNumbers(Player player, int i) {
        if (player.getAttempt(i) > compNumber) {
            System.out.println("Ваше число больше, чем загаданное компьютером" + compNumber);
        } else if (player.getAttempt(i) < compNumber) {
            System.out.println("Ваше число меньше, чем загаданное компьютером" + compNumber);
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + (i + 1) + " попытки");
        }
    }

    //  Для считывания части массива используйте метод Arrays.copyOf
    private void showNumbers(int[] attempts, int i) {
        int[] attemptsCopy = Arrays.copyOf(attempts, i + 1);
        System.out.println(Arrays.toString(attemptsCopy));
    }

    // Для обнуления массивов игроков, при повторном запуске игры, используйте метод Arrays.fill().
    // При этом обнуляйте только те ячейки, где хранятся, названные игроками числа.
    private void fill(int[] attempts, int i) {
        if (i < 9) {
            Arrays.fill(attempts, 0, i + 1, 0);
        } else {
            Arrays.fill(attempts, 0, i, 0);
        }
    }
}


