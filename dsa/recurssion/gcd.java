package dsa.recurssion;

public class gcd {

    public int gcdMethod(int a,int b)
    {
       if(a<=0||b<0){return -1;} 
       if (b==0) {return a;}
        return gcdMethod( b , a%b);
    } 
    public static void main(String[] args) {
        gcd obj =new gcd();
        var ne1=obj.gcdMethod(12, 2);
        System.out.println(ne1);
    }   
}

