package com.startjava.lesson_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int arrayLength = scanner.nextInt();
        int[] number = new int[arrayLength];

        System.out.print("Заполните массив целыми числами через пробел: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
            //   System.out.print(number[i] + " ");
        }


        // Сумма четных положительных элементов массива
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0 && number[i] >=0) {
                sum += number[i];
            }
        }
        System.out.println("Cумма четных положительных элиментов = " + sum);

        //Максимальный из элементов массива с четными индексами
        int j=0;
        for (int i = 0; i < number.length; i+=2) {
            if (number[i] > number[j]) {
                j=i;
            }
        }
        System.out.println("Максимальный из элементов с четным индексом: " + number[j] + " с индексом "  + j);

        //Элементы массива, которые меньше среднего арифметического
        sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
            }
        sum = sum/number.length;
        System.out.println("Среднее арифмитическое: " + sum);
        System.out.print("Меньше среднего арифметического: ");
        for (int i = 0; i < number.length; i++) {
            if (number[i] < sum) {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println(" ");

         //Найти два наименьших (минимальных) элемента массива
         int minOne = number[0];
         int minTwo = number[1];
         int value = 0;
         if (minOne > minTwo) {
             minOne = number[1];
             minTwo = number[0];
         }
         for (int i = 2; i < number.length; i++) {
              if(number[i] <= minOne) {
                  value = minOne;
                  minOne = number[i];
                  if (value <= minTwo) {
                      minTwo = value;
                  }
              } else if (number[i] <= minTwo ) {
                  minTwo = number[i];
              }

         }
         System.out.println(minOne + " ");
         System.out.println(minTwo + " ");

        //Сортировка массива
        Arrays.sort(number);
        for (int numb : number) {
            System.out.print(numb + " ");
        }
        System.out.println();

        System.out.print("Введите нижнюю границу: ");
        int a = scanner.nextInt();

        System.out.print("Введите верхнюю границу: ");
        int b = scanner.nextInt();

        Arrays.sort(number, a, b);
        for (int numb : number) {
            System.out.print(numb + " ");
        }
        System.out.println(" ");

        //Сжать массив, удалив из него все элементы, величина которых
        // находится в интервале [а, b]. Освободившиеся в конце массива
        // элементы заполнить нулями.
        System.out.print("Введите нижнюю границу: ");
        a = scanner.nextInt();

        System.out.print("Введите верхнюю границу: ");
        b = scanner.nextInt();

        int numberLength = number.length;
        int i = 0;
        while (i < number.length) {
            if (number[i] <= b && number[i] >= a) {
                numberLength--;
                for (int y = i; y < number.length - 1; y++) {
                    number[y] = number[y + 1];
                }
            } else {
                i++;
            }
        }
        for (i = numberLength; i < number.length; i++) {
            number[i] = 0;
        }
        for (int numb : number) {
            System.out.print(numb + " ");
        }

        //Вычислить сумму модулей элементов массива, расположенных после первого отрицательного элемента.


    }
}


