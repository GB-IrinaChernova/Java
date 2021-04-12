package ru.geekbrains.lesson1;


public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");

    }

    public static void checkSumSign() {

        int a = 1;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 10;

        if (value > 100) {
            System.out.println("Зеленый");
        } else if (value <= 0) {
            System.out.println("Красный");
        } else {
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers() {
        int a = 8;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}