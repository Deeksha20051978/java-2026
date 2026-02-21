


class Student{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //for access this is encapuslation pgm
    String getName(){ //not neccessary to use get or set it is for our understanding
        return name;
    }
    int getAge(){
        return age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
}
public class capsule {
    public static void main(String[] args) {
    Student s = new Student("abc", 24);
    System.out.println(s.getName());
    System.out.println(s.getAge());
    s.setName("ABC");
    s.setAge(35);
    System.out.println(s.getName());
    System.out.println(s.getAge());
    
    }
}
