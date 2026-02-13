package exam_10Feb2026;
/*
Student Management System
Implement a class "Student" with attributes "name", "rollNo", and "section".
Add a method to print student details.

Input: Create student with name="Bob", rollNo=101, section="A"
Output: Student: Bob, Roll No: 101, Section: A

Explanation:Implement a Student class with appropriate constructor
and a method to display formatted student information.
 */
class Student
{
   String name;
   int rollNo;
   char section;

    public Student(String name, int rollNo, char section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    void Student_details()
    {
        System.out.println("Student: "+ name);
        System.out.println("Roll No: "+ rollNo);
        System.out.println("Section: "+ section);
    }
}
public class Ch02 {
    public static void main(String[] args) {
        Student s1=new Student("Bob", 101, 'A');
        s1.Student_details();
    }
}
