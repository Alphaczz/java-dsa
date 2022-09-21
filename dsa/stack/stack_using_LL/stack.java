package dsa.stack.stack_using_LL;

public class stack {
  stack_using_LL ssLL;
  public  stack(){
    ssLL=new stack_using_LL();
  }
    //push
    public void push(int value){
        ssLL.insertAtBeginning(value);
        System.out.println("insert successfull "+value+" in stack");

    }
    //isEmpty
    public boolean isEmpty() {
        if (ssLL.head==null) {
            return true;
        }
        else{return false;}
    }
    //pop
    public int pop(){
        int result=-1;
        if (isEmpty()) {
            System.out.println("stack is empty");
        }
        else{
            result=ssLL.head.value;
            ssLL.deleteNode();
        }
        return result;

    }
    //peek
    public int peek(){
        
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        else{
          return ssLL.head.value;
        }
        
    }
        //delete
        public void deletestack(){
            ssLL.head=null;
            System.out.println("stack deleted");
        }
    
}
