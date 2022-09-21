package dsa.linkedlist.singlylinklist;

public class Main {
    public static void main(String[] args) {
        singlelinklist sll = new singlelinklist();
        sll.createsinglylinkedlist(4);
        System.out.println(sll.head.value);
        sll.insertsll(6,4);
        sll.insertsll(5,1 );
        sll.insertsll(4,2);
        sll.insertsll(3,3);
        System.out.println(sll.tail.value);
        sll.traversesll();
    }
}
