package ex_29_Collection_Framework.CF_05_Comparable_Vs_Comparator;

import java.util.ArrayList;
import java.util.List;

public class LabComparable_01 {
    public static void main(String[] args) {
        Employe e1 = new Employe(3, "Amit");
        Employe e2 = new Employe(1, "Pramod");
        Employe e3 = new Employe(5, "Dutta");

        List<Employe> employeList = new ArrayList<>();
        employeList.add(e1);
        employeList.add(e2);
        employeList.add(e3);
        System.out.println(employeList);

    }
}
class Employe {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printDetails() {
        return id + "-" + name;
    }
    public Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}