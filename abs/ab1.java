package abs;

import abs.in1.Child;
import abs.in1.Student;

abstract class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name= name;
        this.age = age;
    }
     abstract void Show(); //cannot access method directly 
}
class Child extends Student{
    int roll;
    Child(String name,int age,int roll){
        super(name,age);
        this.roll=roll;
    }
    void Show(){ // non absract method
        System.out.println(name+" "+age+" "+roll);
    }

}
public class ab1 {
    public static void main(String[] args) {
        Child c = new Child("abc",25,10);
        c.Show();
    }
}

