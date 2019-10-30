public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 7;
        char operation = '+';
        if (operation == '+') {
            int result = firstNumber + secondNumber;
            System.out.println("Сумма чисел " + result);
        }
        else if (operation == '-') {
            int result = firstNumber - secondNumber;
            System.out.println("Разность чисел " + result);
        }
        else if (operation == '*') {
            int result = firstNumber * secondNumber;
            System.out.println("Произведение чисел " + result);
        }
        else if (operation == '/') {
            int result = firstNumber / secondNumber;
            System.out.println("Частное чисел" + result);
        }
        else if (operation == '%') {
            int result = firstNumber%secondNumber;
            if (firstNumber%secondNumber == 0)
                System.out.println("Деление без остатка");
            else
                System.out.println("Остаток от деления " + result);
        }
        else if (operation == '^') {
        int result = 1;
        for (int i=1; i<=secondNumber; i++) {
            result = result*firstNumber;
        }
        System.out.println("Степень числа " + result);
        }
    }
}
