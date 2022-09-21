package dsa.linkedlist.circularDLL.question;

public class linkedlist 
{
    public node head;
    public node tail;
    public int size;

    public void createll(int nodeValue){
    node newNode = new node();
    newNode.value = nodeValue;
    newNode.next = null;
    head = newNode;
    tail = newNode;
    size = 1;
  }
    public void insertNode(int nodeValue) {
        if (head == null) {
          createll(nodeValue);
          return;
        }
    
        node newNode = new node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
      }
    public void traversalLL() {
        node tempNode = head;
        for (int i =0; i<size; i++) {
          System.out.print(tempNode.value);
          if (i != size -1) {
            System.out.print(" -> ");
          }
          tempNode = tempNode.next;
        }
        System.out.println("\n");
      }
    
}
