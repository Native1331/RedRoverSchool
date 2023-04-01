package HW8P2;

public class BaseManager extends Employee {


    private int numberOfSubordinates;

    public BaseManager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        numberOfSubordinates = numberOfSubordinates;
    }


}
