package dsa.linkedlist.doublyLL;

public class Main {
    public static void main(String[] args) {
        doublylinkedlist dLL=new doublylinkedlist();
        dLL.createDLL(2);
        System.out.println(dLL.head.value);
        dLL.insertDLL(12, 0);
        System.out.println(dLL.head.value);
        dLL.insertDLL(11, 3);
        System.out.println(dLL.tail.value);
        dLL.traversedLL();
        dLL.reversetraversedLL();
        dLL.searchelement(11);
    }

    
}
