package ru.geekbrains.lesson6;

public class Dog extends Animal {

        public Dog(String name, int run, int swim) {
                super(name, run, swim);
            }

            public void dogName() {
                System.out.println("Собака: " + super.name);
            }

            public void dogRun() {
                if (super.run <= 500)
                    System.out.println(super.name +  " пробежал " + super.run + " метров ");
                else System.out.println(super.name + " пробежал 500 метров из " + super.run + " метров");
            }

            public void dogSwim() {
                if (super.swim <= 10)
                    System.out.println(super.name + " проплыл " + super.swim + " метров ");
                else System.out.println(super.name + " проплыл 10 метров из " + super.swim + " метров");
            }

             public void dogInfo() {
                 dogName();
                 dogRun();
                 dogSwim();
    }

}