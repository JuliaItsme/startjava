public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 7;
        char operation = '+';

        if (operation == '+') {
            System.out.println("Сумма чисел " + (firstNumber + secondNumber));
        } else if (operation == '-') {
            System.out.println("Разность чисел " + (firstNumber - secondNumber));
        } else if (operation == '*') {
            System.out.println("Произведение чисел " + (firstNumber * secondNumber));
        } else if (operation == '/') {
            System.out.println("Частное чисел" + (firstNumber / secondNumber));
        } else if (operation == '%') {
            if (firstNumber%secondNumber == 0)
                System.out.println("Деление без остатка");
            else
                System.out.println("Остаток от деления " + (firstNumber%secondNumber));
        } else if (operation == '^') {
            int result = 1;
            for (int i=1; i<=secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println("Степень числа " + result);
        }
    }
}
