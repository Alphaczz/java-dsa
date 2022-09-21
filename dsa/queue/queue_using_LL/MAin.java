package dsa.queue.queue_using_LL;

public class MAin {
   public static void main(String[] args) {
    LLinQueue ll = new LLinQueue();
    ll.enqueue(12);
    ll.dequeue();
   boolean result= ll.isEmpty();
   System.out.println(result);
int re=ll.peek();
System.err.println(re);
  
   }
}
