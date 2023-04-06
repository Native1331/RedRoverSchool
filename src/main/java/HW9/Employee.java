package HW9;



public class Employee {
    /*Задaча №1
    Необходимо создать класс Employee со следующими методами:
●	getName - получить имя
●	setName
●	getBaseSalary - базовая ставка
●	setBaseSalary
}*/
      String name;
     int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
