package dsa.recurssion;
public class recurrsion1st{
    public static void main(String[] args)
	{
        
    
    
        second();
        System.out.println("I AM FIRST");
        
    }
   
    

public static void second() {
    third();
    System.out.println("I AM SECOND");
    
}
public static void third() {
    fourth();
    System.out.println("I AM THIRD");
    
}
public static void fourth() {
    System.out.println("I AM LAST");
}
}