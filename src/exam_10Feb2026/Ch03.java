package exam_10Feb2026;
/*
Employee Encapsulation
Implement encapsulation in a class "Employee" with
private attributes "id", "name", and "salary". Add getter and setter methods.

Input: Employee with id=1, name="John Doe", salary=50000
Output: Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0

 Explanation:Create private instance variables and
 provide public getter/setter methods to access and modify them safely.
 */
class Employee
{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class Ch03
{
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John Doe", 50000 );

        System.out.println("Employee ID: " + e1.getId());
        System.out.println("Employee Name: " + e1.getName());
        System.out.println("Employee Salary: " + e1.getSalary());

    }

}
