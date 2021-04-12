package ru.geekbrains.lesson2;

public class HomeWorkSecond {
    public static void main(String[] args) {
        System.out.println(summ(10, 2));
        number(-2);
        System.out.println(isPositive(10));
        printWordNTimes(" строка", 5);
        System.out.println(leapYear(2000));
    }

    public static boolean summ(int a, int b) {
        System.out.println("Домашнее задание к уроку 2");
        System.out.println("Задача 1:");
        int sum = a + b;
        System.out.println(sum);
        System.out.println("Сумма чисел в интервале от 10 до 20 включительно?");
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
    }
}

    public static void number(int x) {
        System.out.println(" ");
        System.out.println("Задача 2:");
        if (x >= 0) {
            System.out.println(+ x + " - Число положительное");
        } else {
            System.out.println(+ x + " - Число отрицательное");
        }
    }

    public static boolean isPositive(int y) {
        System.out.println(" ");
        System.out.println("Задача 3:");
        System.out.println(y);
        System.out.println("Число положительное?");
        if (y >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes(String word, int times) {
        System.out.println(" ");
        System.out.println("Задача 4:");
        for (int i = 0; i < times; i++) {
            System.out.println(+i + word);
        }
        System.out.println("Всего " + times + " строк");
    }

    public static boolean leapYear(int year) {
        System.out.println(" ");
        System.out.println("Задача 5*:");
        System.out.println(+ year + " Високосный год?");
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }
}
