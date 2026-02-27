import abs.in1.Child;

class Parent{
    String name;
    int age;
Parent(String name,int age){
    this.name = name;
    this.age = age;
}
void display(){
    System.out.print(name+" "+age);
}
}
class Child extends Parent{
    int roll;
    Child(String name, int age,int roll){
        super(name,age);//using super to access from parent class 
        this.roll = roll; 
    }
    void show(){
        System.out.print(name+" "+age+" "+roll);
    }
}
//multilevel inheritance
class SubChild extends Child{
    int contact;
    SubChild(String name, int age, int roll, int contact){
        super(name,age,roll);
        this.contact= contact;
    }

   void Show1(){
    System.out.print(name+" "+age+" "+roll+" "+contact);
   }
    
}


 class Main {
    public static void main(String[] args) {
        SubChild c = new SubChild("ABC",24,21,9283);
        //Child c = new Child("AAA", 24, 22);
        c.Show1();
        
    }
    
}
