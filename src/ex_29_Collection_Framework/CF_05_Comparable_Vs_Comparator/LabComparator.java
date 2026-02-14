package ex_29_Collection_Framework.CF_05_Comparable_Vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LabComparator {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3, "John", 134));
        list.add(new Employee(1, "Alice", 100 ));
        list.add(new Employee(2, "Bob", 234));


//        List<Integer> marks = new ArrayList<>();
//        marks.add(100);
//        marks.add(90);
//        marks.add(92);
//        Collections.sort(marks);
//        System.out.println(marks);

     //   Collections.sort(list); //cannot be sorted because it has many elements
     //to overcome this we have to use Comparator

        System.out.println(list);
        System.out.println("----------------------------");
        Comparator<Employee> idComparator = (e1,e2) -> e1.id - e2.id;
        Collections.sort(list, idComparator);
        System.out.println(list);



    }
}
class Employee{
    Integer id;
    String name;
    Integer salary;

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}