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
		int compNumber = ((int) (Math.random() * 100));	

		do{
			System.out.print(playerOne.getName() + ", введите число: ");
			playerOne.setNumber(scanner.nextInt());

			if (playerOne.getNumber() > compNumber) {
				System.out.println("Ваше число больше, чем загаданное компьютером");
			} else if (playerOne.getNumber() < compNumber) {
				System.out.println("Ваше число меньше, чем загаданное компьютером");
			} else {
				System.out.println("Поздравляем!" + " " + playerOne.getName() + " " + "победил!");
				break;
			}

			System.out.print(playerTwo.getName() + ", введите число: ");
			playerTwo.setNumber(scanner.nextInt());

			if (playerTwo.getNumber() > compNumber) {
				System.out.println("Ваше число больше, чем загаданное компьютером");
			} else if (playerTwo.getNumber() < compNumber) {
				System.out.println("Ваше число меньше, чем загаданное компьютером");
			} else {
				System.out.println("Поздравляем!" + " " + playerTwo.getName() + " " + "победил!");
				break;
			}

		} while (true);		
	}
}
