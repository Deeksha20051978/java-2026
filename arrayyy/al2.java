package arrayyy;
import java.util.*;
public class al2 {
    
public static void main(String[] args) {
    

    ArrayList<Integer> list = new ArrayList<>(); //to create an empty arraylist 
    list.add(10);
    list.add(1,20);
    list.add(30);
    list.add(3,40);
    list.set(2,99);
    System.out.println(list.get(3));
    list.remove(0);
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.contains(20));
        list.clear();
        System.out.println(list);
        
}
}


