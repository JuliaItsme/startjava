import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());
            int firstNumber = calculator.getFirstNumber();

            System.out.print("Введите знак математической операции: ");
            char operation = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());
            int secondNumber = calculator.getSecondNumber();

            switch (operation) {
                case '+':
                    calculator.addition(firstNumber, secondNumber);
                    break;
                case '-':
                    calculator.subtraction(firstNumber, secondNumber);
                    break;
                case '*':
                    calculator.multiplication(firstNumber, secondNumber);
                    break;
                case '/':
                    calculator.division(firstNumber, secondNumber);

                case '%':
                    calculator.remainder(firstNumber, secondNumber);
                    break;
                case '^':
                    calculator.degree(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("Вы ввели неверный оператор");
            }

        System.out.print("Хотите продолжить? [да/нет]");
        String answer = scanner.nextLine();
    }
}
