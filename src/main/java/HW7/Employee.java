package HW7;



public class Employee {
   /* Задача №2
    Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
    Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника
    у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
    */

    public String name;
    public int age;
    public char sex;
    public int salary;

     public boolean isSameName(Employee employee) {
        return name.equals(employee.name);
            //return name.equals(employee.name)if (employee.name = name)
        }
    }



