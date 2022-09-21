package dsa.linkedlist.circularDLL;

public class Main {
    public static void main(String[] args) {
        circularDoubleLinkedList cdll =new circularDoubleLinkedList();
        cdll.createCDLL(7);
        System.out.println(cdll.head.value);
        cdll.insertCDLL(2, 21);
        System.out.println(cdll.head.next.value);
    }
    
}
