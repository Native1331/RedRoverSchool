package HW7;

public class Person {
    public String name;
    public int age;
    public char sex;

    public String getFullName() {
        if (sex == 'M') {
            return "Mrs " + name;
        } else {
            return "Mr " + name;
        }
    }
}
