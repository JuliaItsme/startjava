package com.startjava.lesson_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scanner.next();
            String[] elements = mathExpression.split("");               // Разделения строки c помощью метода split()
            calculator.setFirstNumber(Integer.parseInt(elements[0])); //пребразование String в int
            calculator.setOperation(elements[1].charAt(0));           //преобразованеи String в char
            calculator.setSecondNumber(Integer.parseInt(elements[2]));

            calculator.calculate();                                 //вызов метода

            do {
            	System.out.print("Хотите продолжить? [yes/no]: ");
            	answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no")); 
        } while (answer.equals("yes"));
    }
}
