import java.util.Scanner;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void guessingNumber() {
		Scanner scanner = new Scanner(System.in);
		String answer;

		do{
			int numberComp = (0 + (int) (Math.random() * 100));
			
			do{
				System.out.print("Игрок " + playerOne.getName() + ", введите число: ");
				playerOne.setNumber(scanner.nextInt());

				if (playerOne.getNumber() > numberComp) {
					System.out.println("Ваше число больше, чем загаданное компьютером");
				} else if (playerOne.getNumber() < numberComp) {
					System.out.println("Ваше число меньше, чем загаданное компьютером");
				} else {
					System.out.println("Поздравляем! Игрок" + " " + playerOne.getName() + " " + "победил!");
					break;
				}

				System.out.print("Игрок " + playerTwo.getName() + ", введите число: ");
				playerTwo.setNumber(scanner.nextInt());

				if (playerTwo.getNumber() > numberComp) {
					System.out.println("Ваше число больше, чем загаданное компьютером");
				} else if (playerTwo.getNumber() < numberComp) {
					System.out.println("Ваше число меньше, чем загаданное компьютером");
				} else {
					System.out.println("Поздравляем! Игрок" + " " + playerTwo.getName() + " " + "победил!");
					break;
				}

			} while (playerOne.getNumber() != numberComp && playerTwo.getNumber() != numberComp);

			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = scanner.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (answer.equals("yes"));
	}
}
