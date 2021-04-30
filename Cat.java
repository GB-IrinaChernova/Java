package ru.geekbrains.lesson6;

    public class Cat extends Animal {

        public Cat(String name, int run, int swim) {
            super(name, run, swim);
        }

            public void catName() {
                System.out.println("Кот: " + super.name);
            }


            public void catRun() {
                if (super.run <= 200)
                System.out.println(super.name + " пробежал " + super.run + " метров ");
                else System.out.println(super.name +" пробежал 200 метров из " + super.run + " метров");
            }

            public void catSwim() {
                System.out.println(super.name + " не умеет плавать");
            }

            public void catInfo() {
                catName();
                catRun();
                catSwim();
            }
    }
