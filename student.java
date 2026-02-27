public class student {
    String name; // parameter-1
    int age; //para-2
    student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
class Main {
    public static void main(String[] args) {
        student obj = new student("ABC",25);
        obj.display();
    }
}

