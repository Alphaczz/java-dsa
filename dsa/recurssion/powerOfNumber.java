package dsa.recurssion;
//interview question ::::: (easy) :::::
public class powerOfNumber {
    public static int powerMethod(int base,int riseto){
        if (riseto==0||riseto<0) {
            return 1;
            
        }
        return base * powerMethod(base, riseto-1);
    }
 public static void main(String[] args) {
 int baseNO=2;
 int risetono=3;   
    var answer=powerOfNumber.powerMethod(baseNO,risetono);
    System.out.println("the answer for base "+baseNO+" rise to power of "+risetono+" is "+ answer);
}   
}
