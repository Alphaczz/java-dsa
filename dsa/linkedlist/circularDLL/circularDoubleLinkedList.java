package dsa.linkedlist.circularDLL;

public class circularDoubleLinkedList {
    circularDouNode head;
    circularDouNode tail;
    int size;

  circularDouNode createCDLL(int nodevalue) 
    {
        head =new circularDouNode();
        circularDouNode newNode= new circularDouNode();
        newNode.value=nodevalue;
        head=newNode;
        tail= newNode;
        newNode.next=newNode;
        newNode.prev=newNode;
        size=1;
        return head;
    }
public void insertCDLL(int location,int nodeValue)
{
    circularDouNode newNode=new circularDouNode();
    newNode.value=nodeValue;
    if (head!=null)
    {
        createCDLL(nodeValue);
        return;
    }
    else if (location==0)
    {
        newNode.next=head;
        newNode.prev=tail;
        head.prev=newNode;
        head=newNode;
        tail.next=newNode;
        
    }
    else if (location>=size) 
    {newNode.next=head;
     newNode.prev=tail;
     head.prev=newNode;
     tail.next=newNode;
     tail=newNode;
   
    }
    else{
        circularDouNode tempNode=head;
        int index=0;
        while(index<location-1)
        { tempNode.next=tempNode;
            index++;
        }
        newNode.prev=tempNode;
        newNode.next=tempNode.next;
        tempNode.next=newNode;
        tempNode.next.prev=newNode;
    }
    size++;
    
}
public void traverseCDLL() {
    if (head != null) {
        circularDouNode tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print("->"); 
            }
            tempNode=tempNode.next;
          
        }  
    } else {
        System.err.println("the circular single linked list doesnt exist\n");
    }
    System.out.println();
}
    
public void reversetraverseCDLL() {

    if (head != null) {
        circularDouNode tempnode = tail;

        for (int i = 0; i < size; i++) {
            System.out.print(tempnode.value);
            if (i != size - 1) {
                System.out.print("<-");
            }
            tempnode = tempnode.prev;
        }
    } else {
        System.out.println("dll doesnt exist");
    }
    System.out.println();
}

public boolean searchelement(int nodeValue) {
    if (head != null) {
        circularDouNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == nodeValue) {
                System.out.println("the Value is found at: " + i);
                return true;
            }
            temp = temp.next;

        }
    }
    System.out.println("value not found ");
    return false;
}
public void deleteNode(int location) {
    if (head == null) {
      System.out.println("The CDLL does not exist!");
      return;
    } else if (location == 0) {
      if (size == 1) {
        head.prev = null;
        head.next = null;
        head = tail = null;
        size--;
        return;
      } else {
        head = head.next;
        head.prev = tail;
        tail.next = head;
        size--;
      }
    } else if (location >= size) {
      if (size == 1) {
        head.prev = null;
        head.next = null;
        head = tail = null;
        size--;
        return;
      } else {
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        size--;
      }
    } else {
      circularDouNode tempNode = head;
      for (int i = 0; i < location -1; i++){
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      tempNode.next.prev = tempNode;
      size--;
    }
  }

  // Delete Entire CDLL
  public void deleteCDLL() {
    circularDouNode tempNode = head;
    for (int i=0; i<size; i++) {
      tempNode.prev = null;
      tempNode = tempNode.next;
    }
    head = null;
    tail = null;
    System.out.println("The CDLL has been deleted!");
  }
}
