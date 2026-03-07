package linkedlist;

import java.util.*;

public class ll2 {
    public static void main(String[]args){
        Vector<Integer>list = new Vector<>();
        // LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.capacity());
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(30);
        list.addLast(40);
        list.add(2,50);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeFirst();
         System.out.println(list);
         System.out.println(list.getFirst());
         System.out.println(list.getLast());
         System.out.println(list.remove(1));
         System.out.println(list);
         System.out.println(list.size());
         list.ensureCapacity(25);
         
         
    }
}
