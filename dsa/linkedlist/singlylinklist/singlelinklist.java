package dsa.linkedlist.singlylinklist;
/*1 create head ref and tail ref
 *2 create a blank note and assign null.
  3 link head's and tail's nodes.

 */



public class singlelinklist {
   
public node head;
public node tail;
public int size;



public node createsinglylinkedlist(int nodeValue) {
    head= new node();
    node nod = new node();
    nod.next=null;
    nod.value=nodeValue;
    head=nod;
    tail=nod;
    size=1;
    return head;
    
}
public void insertsll(int nodeValue,int location){
    node nod= new node();
    nod.value= nodeValue;
    if(head==null){
        createsinglylinkedlist(nodeValue);
        return;
    }
    else if(location==0){
        nod.next=head;
        head=nod;
    }
    else if(location>=size){
     nod.next=null;
     tail.next=nod;
     tail= nod;
    }
    else{
        node tempNode=head;
        int index=0;
        while (index<location-1) {
            tempNode=tempNode.next;
            index++;
            
        }
        node nextNode=tempNode.next;
        tempNode.next=nod;
        nod.next=nextNode;

    }
    size++;
}
//traversal of sll
public void traversesll() {
    node temp;

    if (head==null) {
        System.out.println("sll doesnt exist!");
    }
    else{
        temp= head;
        for (int i = 0; i < size; i++){
            System.out.print(temp.value);
            if (i!=size-1) {
                System.out.print("-->");
            }
            temp=temp.next;
        }
       
    }
    System.out.println("\n");
    
}
public boolean searchNode(int nodeValue) {
    if (head!= null) {
        node temp=head;
        for (int i = 0; i < size; i++) {
            if (temp.value==nodeValue) {
                System.out.println("Node found"+temp);
                return true;
            }
            temp=temp.next;
            
        }

        
    }
    System.out.println("Node not found");
    return false;
    
}

}

