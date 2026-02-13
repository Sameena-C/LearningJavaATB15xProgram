package exam_10Feb2026;
/*
Employee Hierarchy with Salary Calculation
Create an Employee base class and Manager, Developer subclasses.
Each should have different salary calculation methods.

Input:
Manager with base salary 60000 and bonus 10000, Developer with hourly rate 50 and 160 hours

Output:
Manager Salary: 70000.0 Developer Salary: 8000.0

Explanation:Implement inheritance with specialized behavior in subclasses
for different salary calculation logic.
 */
class Employeee{
     static void Salary_Calculation()
    {

    }
}
class Manager extends Employeee{

     void Manager_Salary()
    {
        int base_sal = 60000;
        int bonus = 10000;
        double m_sal = base_sal + bonus;
        System.out.println("Manager Salary: " + m_sal);
    }
}
class Developer extends Employeee{
     void Developer_Salary()
    {
        int hourly_rate = 50;
        int hours = 160;
        double d_sal = hourly_rate * hours;
        System.out.println("Developer Salary: " + d_sal);
    }
}
public class Ch07 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.Manager_Salary();
        Developer d = new Developer();
        d.Developer_Salary();
    }
}
