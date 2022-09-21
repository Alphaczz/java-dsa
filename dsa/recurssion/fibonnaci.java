package dsa.recurssion;
public class fibonnaci {
    public int fib(int n)
    {
        if (n==0||n==1) {
            return 1;
            
        }
        if(n<0){return -1;}
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        fibonnaci obj = new fibonnaci();
        int no=9;
        var fibres =obj.fib(no);
        System.out.println("the fibonnaci number of "+no+" is--> "+fibres );
        
    }
}
