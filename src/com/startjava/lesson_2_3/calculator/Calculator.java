package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case '+':
                System.out.println("Сумма чисел " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Разность чисел " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Произведение чисел " + (firstNumber * secondNumber));
                break;
            case '/':
                System.out.println("Частное чисел" + (firstNumber / secondNumber));
                break;
            case '%':
                if (firstNumber % secondNumber == 0) {
                    System.out.println("Деление без остатка");
                } else {
                    System.out.println("Остаток от деления " + (firstNumber % secondNumber));
                }
                break;
            case '^':
                int result = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println("Степень числа " + result);
                 break;
            default:
                System.out.println("Вы ввели неверный оператор");
        }
    }
}