package HW8P1;

public class Employee extends BaseEmployee{

    //public Employee(String name, int age, char sex, int daySalary) {
    //    super (name, age, sex, daySalary);
   // }

    public int getSalary(int days) {
        return getDaySalary() * days;
    }
}
