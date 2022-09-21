package dsa.queue.queue_using_LL;

public class LLinQueue {
    queue_using_LL list;
    public LLinQueue()
    {
        list=new queue_using_LL();
        System.out.println("Queue created");
    }
    public boolean isEmpty()
    {
        if(list.head==null)
        return true;
        else return false;
    }
    public void enqueue(int nodeValue)
    {
         list.insertAtBeginning(nodeValue);
         System.out.println("successfully value insserted");
    }
    public int dequeue() {
        int value =-1;
        if (isEmpty()) {
            System.err.println("queue empty");
            return -1;}
        else{
            value =list.head.value;
            list.deleteNode();
            System.out.println("value deleted");
            return value;
        }    
            
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            else{
                return list.head.value;
            }
        }
        public void delQueue(){
            list.head=null;
            list.tail=null;
            System.out.println("deleted successfully");
        }
        
    }

