package com.startjava.lesson_4.calculator;
import java.lang.Math;


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

	private void powNumb() {
        System.out.println("Степень числа " + Math.pow(firstNumber, secondNumber));
	}
	
	private void remain() {
		System.out.println("Остаток от деления " + Math.IEEEremainder(firstNumber, secondNumber));
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
				remain();
                break;
            case '^':
                powNumb();
                 break;
            default:
                System.out.println("Вы ввели неверный оператор");
        }
    }
}
