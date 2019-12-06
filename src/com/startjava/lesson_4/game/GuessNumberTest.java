package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("У вас 10 попыток");

		System.out.print("Введите имя первого игрока: ");
		Player playerOne = new Player(scanner.next());

		System.out.print("Введите имя второго игрока: ");
		Player playerTwo = new Player(scanner.next());

		GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
		String answer;
		do {
			guessNumber. startGame();
			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = scanner.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (answer.equals("yes"));
	}
}
