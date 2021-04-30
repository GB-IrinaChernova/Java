package ru.geekbrains.lesson6;

public class AnimalApp {

    public static void main(String[] args) {

        System.out.println("1 вариант вывода ");
        System.out.println();
            Cat cat = new Cat("Барсик", 300, 2);
            cat.catInfo();
            System.out.println();
            Dog dog = new Dog("Бобик", 700, 11);
            dog.dogInfo();

        System.out.println();
        System.out.println();
        System.out.println("2 вариант вывода ");
        System.out.println();

        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Барсик", 300, 2);
        catArray[1] = new Cat("Васька", 100, 1);
        catArray[2] = new Cat("Рыжик", 200, 4);

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].catInfo();
            System.out.println();
         }
        System.out.println("Всего: " + catArray.length + " кошки" );
        System.out.println();

        Dog[] dogArray = new Dog[4];
        dogArray[0] = new Dog("Бобик", 400, 7);
        dogArray[1] = new Dog("Шарик", 600, 10);
        dogArray[2] = new Dog("Рекс", 500, 7);
        dogArray[3] = new Dog("Халк", 700, 11);

        for (int i = 0; i < dogArray.length; i++) {
            dogArray[i].dogInfo();
            System.out.println();
        }
        System.out.println("Всего: " + dogArray.length + " собаки" );
        System.out.println();

        System.out.println("Всего: " + ((catArray.length) + (dogArray.length))+ " животных    /* для 2 варианта вывода " );

    }
    }