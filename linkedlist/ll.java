package linkedlist;
class Node{
    int data;
    Node next;
//creating a node
    Node(int data){
        this.data = data;
        next = null;
}
}
public class ll {
    public static void main(String[] args){
        //creating node in linked list 
        Node head = new Node(10);
        head.next = new Node(20);
        System.out.println(head.data);
        System.out.println(head.next.data);
    }
   
    }

