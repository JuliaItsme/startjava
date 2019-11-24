import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();

		System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scanner.next());
        String nameOne = playerOne.getName();

        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scanner.next());
        String nameTwo = playerTwo.getName();

        guessNumber.guessingNumber(nameOne, nameTwo);
    }
}
