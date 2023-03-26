package HW8P1;

public class BaseEmployee {


    /*Задача №1

    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
    Все поля сделать приватными и для каждого поля добавить методы set и get.
    Класс должен иметь метод - getSalary(int days),
    метод возвращает зарплату за количество дней которые были переданы
    в качестве аргумента.
         */
    String name;
    int age;
    char sex;
    int daySalary;


    public String getName() {
        return name;
    }

    public String setName(String name) {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return age;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public int setDaySalary(int daySalary) {
        return daySalary;
    }

    public char getSex() {
        return sex;
    }

    public char setSex(char sex) {
        return sex;
    }


    public int getSalary(int days) {

        return (daySalary * days);

    }
}

