import HW8P2.Employee;
import ПройденныеУроки.Uravnenie;

public class MyClass {
    private String name;

    public static void main(String[] args) {
        Employee employee = new Employee("Name", 1);
        System.out.println(employee.getName());

        Uravnenie uravnenie = new Uravnenie.Builder()
                .setParam(1)
             //   .setStringParam(" ")
                .setDoubleParam(1d)
                .build();
        System.out.println(uravnenie);
    }


    void cals() {
        Pair pair = new Pair();
    }

    private class Pair {
        int first;
        double second;
    }
}

