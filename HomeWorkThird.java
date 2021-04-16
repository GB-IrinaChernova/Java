package ru.geekbrains.lesson3;

public class HomeWorkThird {
    public static void main(String[] args) {
        System.out.println("*** HomeWork 3  Массивы ***");
        System.out.println(" ");
        firstArray();
        secondArray();
        thirdArray();
        fourthArray();
        fifthArray(5, 2);
        sixthArray();
        seventhArray();
        eighthArray();
    }

       /**
        * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        * */

    public static void firstArray() {
        System.out.println("Задание 1");
        System.out.println(" ");
        int i;
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.print("Задан массив: { ");
        for (i = 0; i < 10; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println(" } ");
        System.out.print("Новый массив: { ");
        for(i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println(" } ");
        }

    /**
     * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     * */

    public static void secondArray() {
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println(" ");
        int[] arr = new int[100];
        int i;
        System.out.print("Заполняем массив: { ");
        for(i = 0; i < 100; i++) {
            arr[i] = i+1;
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println(" } ");
    }

    /**
     *  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     *  */

    public static void thirdArray() {
        System.out.println(" ");
        System.out.println("Задание 3");
        System.out.println(" ");
        int i;
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.print("Задан массив: { ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println(" } ");
        System.out.print("Новый массив: { ");
        for(i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i]*2;
                        }
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println(" } ");
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    * цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    * то есть [0][0], [1][1], [2][2], …, [n][n];
     * */

    public static void fourthArray() {
        System.out.println(" ");
        System.out.println("Задание 4");
        System.out.println(" ");
        int[][] table = new int[4][4];
        int i, j;
        int a = 2;
        System.out.println("Задан массив");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                table[i][j] = a;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Массив, в котором элементы главной диагонали равны 1");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
        if ( i == j ) {
                    table[i][j] = 1;
             }
                System.out.print(table[i][j] + " ");
        }
            System.out.println();
    }
        System.out.println();
        System.out.println("Массив, в котором элементы обеих диагоналей равны 1");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if ( i + j == 3 ) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
    * типа int длиной len, каждая ячейка которого равна initialValue;
     **/
    public static void fifthArray(int len, int initialValue) {
        System.out.println(" ");
        System.out.println("Задание 5");
        System.out.println(" ");
        int[] arr = new int[len];
        int i;
        System.out.print("Заполняем массив: { ");
        for(i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println(" } ");
    }

    /**
     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     * */
    public static void sixthArray() {
        System.out.println(" ");
        System.out.println("Задание 6*");
        System.out.println(" ");
        int i, min, max;
        int[] arr = {10, 5, 3, 0, 11, 4, 5, 2, 4, 8, 9, 12};
        min = arr[0];
        max = arr[0];
        System.out.print("Задан массив: { ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println(" } ");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (i = 0; i < arr.length; i++) {
            if ( arr[i] > max) {
                 max = arr[i];
             }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
    /**
     * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     **Примеры:
    * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
     * */
    public static void seventhArray() {
        System.out.println(" ");
        System.out.println("Задание 7**");
        System.out.println(" Нет решения");
    }

    /**
     * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
    * отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     * При каком n в какую сторону сдвиг можете выбирать сами.
     * */
        public static void eighthArray() {
            System.out.println(" ");
            System.out.println("Задание 8***");
            System.out.println(" Нет решения");
        }

}
