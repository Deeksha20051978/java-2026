//create an interface
interface School{
    void schoolName();
}
class Student{ //this is a class 
    String name;
    Student(String name){ //create a constructor
        this.name = name;
    }
}
class ClassBusybee extends Student implements School{ //the child class has access to both class and interface 
    int roll;

    // public ClassBusybee() {
    //     super(null);
    // }
    ClassBusybee(String name, int roll){ //childclass
        super(name);
        this.roll = roll;
    }
    //create method for the interface here 
    public void schoolName(){
        System.out.println("Babyboss School");
    }
    //another method here 
    void show(){
        System.out.println(name+" "+roll);
    }

}
public class hybrid{
    public static void main(String[] args) {
        ClassBusybee  b = new ClassBusybee("avs",10);
        b.schoolName();
        b.show();
    }
}
    

