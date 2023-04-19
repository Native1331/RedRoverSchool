import java.awt.print.Printable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson15 implements Printable {
    /*public static void main(String[] args) {
        ArrayList arrayList= new ArrayList();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("One");

        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        arrayList.remove(1);
        System.out.println("remove 1"+ arrayList+"size:" + arrayList.size());

        System.out.println(arrayList.contains("A"));
        System.out.println(arrayList.contains("B"));


        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(234);

       System.out.println("arr1:" +arr1);*/

    /* GenericExample<String> str = new GenericExample<>("test value");
     System.out.println(str.getField());
     GenericExample<Integer> in = new GenericExample<>(123);
     System.out.println(in.getField());*/
    List<Printable>printables= Array.asList(//рекомендованный способ, используется в Scala
            new Office("Seatle"),
            new Employee("Sam Smith", 10000)
    );
    List<HW8P2.Employee> list = new ArrayList<>();
    list.add(new Employee(John, 2000));
    list.add(new Employee(Klara, 1000));
    list.add(new Employee(Sven, 2000));
    list.add(new Employee(Anna, 1500));
    list.sort(new SalaryComparator().reversed());
    /*for(object o: objects){
        System.out.println(o.getPrintable);
    }*/


    printList(employee);

    List<Integer> ints = new ArrayList<>();
    ints.add(1);
    ints.add(2);

    printList(ints);

    List<Office> offices = new ArrayList<>();
    offices.add(new Office("San Francisco"));
      offices.add(new Office("New-York"));
        offices.add(new Office("Texas"));
          offices.add(new Office("Oklahoma"));
          printList(offices);

          List<Printable> printable = new ArrayList<>();
          printable.add(new Office("Seatle"));
          printable.add(new Employee("Sam Smith", 100));
          printList(printable);
}
static class Employee {
    public String getName() {
        return name();
    }
@Override
    public String getPrintableString() {
        return "Employee" + name + ":" + salary;
    }
}
static class Office implements Printable {
    public Office(String Location) {
        this.location = location;
    }

    String location;
@Override
    public String getPrintableString() {
        return "Office: " + location;
    }
static interface Printable{

}
    @Override
    public String toString() {
        return "Employee{}";
    }

    static class SalaryComparator implements Comparator<Employee>{
        @Override
           public  int compare(Employee o1, Employee o2){
            return();
        }
       }

    public static <T> void printList(List<Employee> list) {
        for(Employee t : list) {
            System.out.println(t.getPrintableString()));
        }
        System.out.println("------------------");

    }
        public static <T> void printList(List<Employee> list) {
            for(Employee s : list) {
                System.out.println(s.getName()+":" + s.getSalary());
            }
            System.out.println("------------------");

    }
   /* public static void printOfficeList(List <Offices> list){
        for(Offices t : list) {
            System.out.println(t.getPrintableString());
        }*/

        public static < extends Printable> void printList(List <T> list){
            for(T t : list) {
                System.out.println(t.getPrintableString());
            }
            System.out.println("------------------");

    }
    }
}
//? ставится когда не важно какой элемент