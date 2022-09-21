package dsa.linkedlist.circularsingleLL;

public class Main {
    
    public static void main(String[] args) {
        circularSingleLL csl =new circularSingleLL();
        csl.createsLL(5);
        System.out.println(csl.head.value);
        System.out.println(csl.head.next.value);
        csl.insertionCSLL(0, 12);
        csl.insertionCSLL(1, 13);
        csl.insertionCSLL(1, 3);
        System.out.println(csl.head.value);
        System.out.println(csl.head.next.next.value);
        csl.traverseCSLL();
      
        

    }
}
