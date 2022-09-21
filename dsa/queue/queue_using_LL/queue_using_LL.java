package dsa.queue.queue_using_LL;



public class queue_using_LL {
  public node head;
  public node tail;
  public int size=0;

  public node createLL(int nodeValue){
    head = new node();
    node nod = new node();
    nod.next =null;
    nod.value=nodeValue;
    head=tail=nod;
    size=1;
    return head;
  }
  public void insertAtBeginning(int nodeValue){
    node nod =new  node();
    nod.value=nodeValue;
    if (head==null) {
        createLL(nodeValue);
        size++;
    }else {
    nod.next=head;
    head=nod;
    size++;}
  }
public void deleteNode(){
    if (head==null) {
        System.out.println("queue doesnot exist.");
    }else{
        head=head.next;
        size--;  
    }
}
 
      
  }

    

