package HW9;

import HW8P2.BaseManager;

public class Manager extends BaseManager {

    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates, int numberOfSubordinates1) {
        super(name, baseSalary, numberOfSubordinates);
        this.numberOfSubordinates = numberOfSubordinates1;
    }



    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return (int) (getSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }
    }
}
