package dsa.stack.stack_using_array
;

public class stack {
    int[] arr;
    int topOfStack;
public stack(int size){
    this.arr=new int[size];
    this.topOfStack=-1;
    System.out.println("this stack is created of size :"+size);
}
public boolean isEmpty(){
    if(topOfStack==-1)
    return true;
    else return false;
}
public boolean isFull(){
    if(topOfStack==arr.length-1){
    System.out.println("stack is full");
    return true;}
    else return false;
}
public void push(int value){
    if (isFull()) 
    {System.out.println("stack is full!");
    }
    else{
        arr[topOfStack+1]=value;
        topOfStack++;
        System.out.println("value successfully inserted!");
    }
}
public int pop() 
{
 if (isEmpty()) 
 {
 System.out.println("is Empty");   
 return -1;
 }   
 else{
    int topStack=arr[topOfStack];
    topOfStack--;
    System.out.println("poped element :"+topStack);
    return topOfStack;
 }
}
public int peek()
{
    if (isEmpty()) {
        System.out.println("is empty");
        return -1;   
    }
    else{
    return arr[topOfStack];

    }
}
public void deletestack(){
    arr=null;
    System.out.println("deleted successfully");


}

}
