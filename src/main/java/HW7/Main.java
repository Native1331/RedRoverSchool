package HW7;

public class Main {
    public static void main(String[] args) {
        Person Jane = new Person();
        Jane.name = "Jane Hus";
        Jane.age = 25;
        Jane.sex = 25;


        Person John = new Person();
        John.name = "John White";
        John.age = 32;
        John.sex = 26;

        Employee a = new Employee();
        a.name = "Jane Hus";
        a.age = 25;
        a.sex = 25;
        a.salary = 1500;


        Employee b = new Employee();
        b.name = "Joh White";
        b.age = 32;
        b.sex = 26;
        b.salary=2000;

        System.out.println(John.getFullName());
        System.out.println(Jane.getFullName());
        System.out.println(a.isSameName(a));
        System.out.println(b.isSameName(b));





    }
}

    /*Задача №1

Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает имя с
префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.*/




