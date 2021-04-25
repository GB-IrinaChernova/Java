package ru.geekbrains.lesson5;

public class HomeWorkFifth {
    public static void main(String[] args) {

        Person person1 = new Person ("Ivanov", "Middle QA", "Ivanov@mail.ru", "7212", 100000, 45);
        Person person2 = new Person ("Petrov", "QA Engineer", "Petrov@mail.ru", "7210", 80000, 37);
        person1.info();
        person2.info();

        System.out.println();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivanovi@mailbox.com", "1234", 30000, 30);
        persArray[1] = new Person("Petrov Sergey", "Manager", "petrovs@ailbox.com", "2345", 35000, 34);
        persArray[2] = new Person("Petrova Ludmila", "HR Manager", "petroval@ailbox.com", "3456", 40000, 45);
        persArray[3] = new Person("Sorokin Pavel", "IT Specialist", "sorokinp@ailbox.com", "4567", 39000, 37);
        persArray[4] = new Person("Egorov Maksim", "HR Manager", "egorovm@ailbox.com", "5678", 33000, 44);

        System.out.println("Наши сотрудники: ");

        for (int i = 0; i < persArray.length; i++) {
            persArray[i].info();
        }
        System.out.println();
        System.out.println("Наши сотрудники старше 40 лет: ");

        for (int i = 0; i < persArray.length; i++) {
             if (persArray[i].age > 40) persArray[i].info();
        }
    }

}
