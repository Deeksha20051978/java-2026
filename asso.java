class Teacher{
    String name;
    Teacher(String name){
        this.name = name;
    }
}
//this is Has-A and we are creating a relationship between student class and teacher class 
// t as a parameter to associate them
//we are passing reference of the previous class as a parameter in the next class 
class Student{ 
    String name;
    Student(String name){
        this.name = name;
    }
    void learn(Teacher t){ //t - reference variable
        System.out.print(name+" learns"+ t.name);
    }
}
public class asso {
    public static void main(String[] args) {
        Teacher t = new Teacher("jin");
        learn l= new learn("the plague");
        t.learn(l);
    }
    
}
