package dsa.recurssion;


//interview question ::::: (easy):::::

public class sumOfTwoDigits {
    public static int sum(int n){
        if (n<0 || n==0) {
            return 0;
            
        }
        return n%10 + sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println("the sum of numbers:");
        var sumofno= sumOfTwoDigits.sum(101111111);
        System.out.println("answer:"+sumofno);

    }
    
}
