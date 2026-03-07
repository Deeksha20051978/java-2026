import java.util.*;

public class queue {
    public static void main(String[]args){
        PriorityQueue<Integer> list = new PriorityQueue<>(Comparator.reverseOrder());
        list.add(30);
        list.add(10);
        list.add(20);
        list.poll();
        System.out.println(list);
    }
}
