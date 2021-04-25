package ru.geekbrains.lesson5;

import java.util.Locale;

public class Person {
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    public int age;

    public Person(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println( "ФИО: " + name+ "; Должность: " + position + "; Электронная почта: " + email +
                "; Номер телефона: " + number + "; Заработная плата: " + salary + "; Возраст: " + age);
    }


}

