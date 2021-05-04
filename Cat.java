package ru.geekbrains.lesson7;

    public class Cat {
        private String name;
        private int appetite;
        private boolean satiety;

        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = false;
        }

        public void eat(Plate p) {
            if (!satiety) {
                satiety = p.decreaseFood(appetite);
            }
        }
        public void info() {
                if (satiety) {
            System.out.println("Кот " + name + " с аппетитом " + appetite + " поел и стал сыт");
        }
            else {
                    System.out.println("Кот " + name + " с аппетитом " + appetite + " остался голоден, нет корма");
                }
      }
    }