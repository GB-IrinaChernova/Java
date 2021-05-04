package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void before() {
        System.out.println("В миске " + food + " корма было\n");
    }
    public boolean decreaseFood(int input) {
        boolean output = false;
        if (food - input >= 0) {
            food -= input;
            output = true;
        }
        return  output;
    }

   public void addFood(int input) {
        this.food += input;
       System.out.println("В миску еще добавили " + input + " корма\n" );
    }
    public void after() {
        System.out.println("В миске осталось " + food + " корма");
    }

}