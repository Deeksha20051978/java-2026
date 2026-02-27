class Student{
    String name;
    Student(String name){  //name is a parameter
        this.name=name;

    }
}
    class Department{ //here reference obj is considered as a data memeber in the second class 
       String deptName;
       Student student; //this is a data member
       Department(String deptName, Student student) { //constructor
            this.deptName = deptName;
            this.student = student;
        
    }
    void show(){
        System.out.println(student.name+" belongs to "+deptName);
    }
}


public class agg {
    public static void main(String[] args) {
        
    
    Student s = new Student("abc");
    Department d = new Department("ISE",s);
    d.show();
    }
    
}
