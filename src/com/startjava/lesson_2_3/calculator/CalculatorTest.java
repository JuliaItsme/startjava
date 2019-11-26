package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());

            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());

            calculator.calculate();

            do {
            	System.out.print("Хотите продолжить? [yes/no]: ");
            	answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no")); 
        } while (answer.equals("yes"));
    }
}
