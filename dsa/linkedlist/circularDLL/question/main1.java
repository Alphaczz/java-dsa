package dsa.linkedlist.circularDLL.question;

public class main1{
    public static void main (String[] args) {
        linkedlist ll=new linkedlist();
        ll.createll(1);
        ll.insertNode(12);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(12);
        linkedlist llb=new linkedlist();
        llb.createll(12);
        llb.insertNode(1);
        llb.insertNode(8);
        llb.traversalLL();
        linkedlist llc=new linkedlist();
        llc.createll(8);
        llc.insertNode(8);
        llc.insertNode(8);
        questions q =new questions();
       linkedlist quest4= q.sumLists(llb,llc);
       quest4.traversalLL();
    


    }
   
}
