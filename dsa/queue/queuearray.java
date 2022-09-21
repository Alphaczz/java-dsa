package dsa.queue;



public class queuearray {
    int[] arr ;
    int topOfQueue;
    int begginningOfQueue;

    public queuearray (int size) {
        this.arr=new int[size];
        this.topOfQueue=-1;
        this.begginningOfQueue=-1;
        System.out.println("Queue Created");
        
    }
  public boolean isFull() 
  {
    if (topOfQueue==arr.length-1)
     {
    return true;    
    }
    else return false;
  }
  public boolean isEmpty(){
    if(begginningOfQueue==-1||begginningOfQueue==arr.length)
    {return true;}
    else return false;

  }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("the Queue is full");
            
        }
        else if (isEmpty()) 
        {
        begginningOfQueue=0;
        topOfQueue++;
        arr[topOfQueue]=value;
        System.out.println("value "+value+" "+"is inserted at arrary location "+topOfQueue);    
        }
        else{
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("value "+value+" "+"is inserted at arrary location "+topOfQueue);    
        }
    }
    public int deQueue() 
    {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int result=arr[begginningOfQueue];
            begginningOfQueue++;
            if(begginningOfQueue>topOfQueue){
                topOfQueue=begginningOfQueue=-1;

            } return result;   }
        }

           public int peek(){
            if (!isEmpty()) {
                return arr[begginningOfQueue];
            }else return -1;
           }
        public void deleteQueue()
        {
            arr=null;
            System.out.println("successfully deleted!");
        }   
}
