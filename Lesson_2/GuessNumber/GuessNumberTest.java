import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        String answer;
        
        do {
            System.out.print("Введите имя первого игрока и число: ");
            Player playerOne = new Player(scanner.next(), scanner.nextInt());
            guessNumber.guessingNumber(playerOne.getNumber());

            System.out.print("Введите имя второго игрока и число: ");
            Player playerTwo = new Player(scanner.next(), scanner.nextInt());
            guessNumber.guessingNumber(playerTwo.getNumber());

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
