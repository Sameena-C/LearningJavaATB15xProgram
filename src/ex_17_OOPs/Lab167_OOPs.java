package ex_17_OOPs;

public class Lab167_OOPs {
    public static void main(String[] args) {
        Person p1; //Here p1 is object reference variable -> This points to null area
        Person p2=new Person(); //new Person();-> This is an object
        // Class Reference(Memory in Heap area) = Object

        new Person(); //This is also an object without reference(no address)

        Person p11=new Person();
        p11.name = "Somya";

        Person p12=new Person();
        p12.name = "Yogesh";

        Person p13=new Person();
        p13.name = "Somya";
    }
}
