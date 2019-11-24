import java.util.Scanner;

public class GuessNumber {
	public void guessingNumber(String playerOne, String playerTwo) {
		Scanner scanner = new Scanner(System.in);
		Player numbers = new Player();
		String answer;

		do{
			int numberComp = (0 + (int) (Math.random() * 100));
			int numberOne;
			int numberTwo;

			do{
				System.out.print("Iгрок " + playerOne + ", введите число: ");
				numbers.setNumber(scanner.nextInt());
				numberOne = numbers.getNumber();

				if (numberOne > numberComp) {
					System.out.println("Ваше число больше, чем загаданное компьютером");
				} else if (numberOne < numberComp) {
					System.out.println("Ваше число меньше, чем загаданное компьютером");
				} else {
					System.out.println("Поздравляем!" + " " + playerOne + " " + "Вы победили!");
					break;
				}

				System.out.print("Iгрок " + playerTwo + ", введите число: ");
				numbers.setNumber(scanner.nextInt());
				numberTwo = numbers.getNumber();

				if (numberTwo > numberComp) {
					System.out.println("Ваше число больше, чем загаданное компьютером");
				} else if (numberTwo < numberComp) {
					System.out.println("Ваше число меньше, чем загаданное компьютером");
				} else {
					System.out.println("Поздравляем!" + " " + playerTwo + " " + "Вы победили!");
					break;
				}
			} while (numberOne != numberComp && numberTwo != numberComp);

			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = scanner.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (answer.equals("yes"));
	}
}
