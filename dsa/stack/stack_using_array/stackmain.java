package dsa.stack.stack_using_array;

public class stackmain {
    
public static void main(String[] args) {
    stack newstack = new stack(5);
    boolean result = newstack.isEmpty();
    System.out.println(result );
    newstack.push(12);
    newstack.push(12);
    newstack.push(12);
    newstack.push(2102202);
    int resl=newstack.pop();
    int res=newstack.peek();
    newstack.push(12);
    System.out.println(res);
    System.out.println(resl);
    newstack.deletestack();

    
    
    
    
     
}

    
}
