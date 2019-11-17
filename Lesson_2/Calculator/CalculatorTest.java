import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;

        do {

            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());
            int firstNumber = calculator.getFirstNumber();

            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));
            char operation = calculator.getOperation();

            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());
            int secondNumber = calculator.getSecondNumber();

            calculator.result(firstNumber, secondNumber, operation);

            System.out.print("Хотите продолжить? [yes/no]: ");
            answer = scanner.next();

            while (answer.equals("no")) {
                break;
            } 
        } while (answer.equals("yes") || answer.equals(" "));
    }
}
