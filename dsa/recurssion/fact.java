package dsa.recurssion;

public class fact {
    public int recurrsion(int x) {
        if (x == 0|| x==1) {
            return 1;
            
        }
        else if (x<0){
            return -1;
            
        }
        
            return x*recurrsion(x-1);
    
        
        
    }
    public static void main(String[] args) {
        System.out.println("enter number you want factorial of//");
        fact obj = new fact();
        var rec= obj.recurrsion(-1);
        System.out.println(rec);
        
    }
}
