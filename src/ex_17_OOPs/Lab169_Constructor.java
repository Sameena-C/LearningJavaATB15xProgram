package ex_17_OOPs;

public class Lab169_Constructor {
    public static void main(String[] args) {
        Animal dog1; //Here constructor will not be called

        Animal dog=new Animal();//Here Default constructor will be called
        A a=new A();
        MySQL m=new MySQL();
        ReadExcelFile r=new ReadExcelFile();
    }
}
class A{
    A(){
        System.out.println("DC -A");
    }
}

class MySQL{
    MySQL(){
        System.out.println("MySQL Connections");
    }
}

class ReadExcelFile{
    ReadExcelFile(){
        System.out.println("Excel File is Loaded!");
    }
}