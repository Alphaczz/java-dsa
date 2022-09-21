package dsa.queue;

public class mainqueue {
    public static void main(String[] args) {
    queuearray new1=new queuearray(5);
    boolean isfull=new1.isFull();
    System.out.println(isfull);
    new1.enQueue(12);
    new1.enQueue(22);
    new1.enQueue(1111);
    int e=new1.deQueue();
    System.out.println(e);
  // circular queue 
    int re=new1.peek();
    System.out.println("this "+re);
    new1.deleteQueue();
    circularqueue cir = new circularqueue(5);
boolean res=cir.isFull();
System.out.println(res);
cir.enQueueinCircularQueue(12);
cir.enQueueinCircularQueue(13);
cir.enQueueinCircularQueue(14);
cir.enQueueinCircularQueue(15);
cir.enQueueinCircularQueue(16);
}
    
}
