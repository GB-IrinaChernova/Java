package ru.geekbrains.lesson6;

    /** 1. Создать классы Собака и Кот с наследованием от класса Животное.
     2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
     3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     4. * Добавить подсчет созданных котов, собак и животных.
**/
    public class Animal {
        String name;
        int run;
        int swim;

        public Animal(String name, int run, int swim) {
            this.name = name;
            this.run = run;
            this.swim = swim;

        }
        public void animalInfo() {System.out.println("Животное: " + name); }
        public void run() {System.out.println("Животное пробежало " + run + " метров"); }
        public void swim() {System.out.println("Животное проплыло" + swim + " метров"); }
    }
