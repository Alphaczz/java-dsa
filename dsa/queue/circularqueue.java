package dsa.queue;

public class circularqueue {
    int [] circArr;
    int topOfQueue;
    int begginningOfQueue;
    int size;
public circularqueue(int size)
{
    this.circArr=new int[size];
    this.size=size;
    this.topOfQueue=-1;
    this.begginningOfQueue=-1;
    System.out.println("circular queue is successfully created");

}
public boolean isEmpty(){
    if (topOfQueue==-1) 
    {
     return true;    
    }
   
    else return false;
}
public boolean isFull(){

    if (topOfQueue+1==begginningOfQueue||begginningOfQueue==0 && topOfQueue+1==size) {
        System.out.println("Queue is Full");
        return true;
    }

    else return false;

}

 public void enQueueinCircularQueue(int value)
 {if (isFull()) {
    System.out.println("is full");
 }
    else if (isEmpty())
    {begginningOfQueue=0;
        topOfQueue++;
        circArr[topOfQueue]=value;
        System.out.println("value "+value+" "+"is inserted at arrary location "+topOfQueue);    
    
    }
    else{
        if (topOfQueue+1==size) 
        {
        topOfQueue=0    ;
        }
        else{
            topOfQueue++;
        }
        circArr[topOfQueue]=value;
        System.out.println("value "+value+" "+"is inserted at arrary location "+topOfQueue);    
    
    }
 }
}
