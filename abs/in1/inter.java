package abs.in1;

interface Student{
    void Show();
}
class Child implements Student{
    String name;
    int age;
    Child(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void Show(){
        System.out.println(name+" "+age); {
            
        }
    }
}
public class inter {
    public static void main(String[] args) {
        Child s = new Child("abC",23); 
        s.Show();
            
        
    }
    
}
