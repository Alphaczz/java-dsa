package dsa.array;
//interview question 1
//Missing Number............

public class missingNumber {
    public static void main(String[] args) {
        int numberseq[]={1,2,3,4,5,6,7,8,9,10,11,13,14,15};
        missingNumber mn=new missingNumber();
        mn.missingNumberMethod(numberseq);

    }
    public void missingNumberMethod(int numberseq[]) {
        int sum1=0,sum2=0;
for(int i : numberseq)
{
    sum1 += i;
}       
sum2=(15*(15+1))/2;   
int diff=sum2-sum1;
System.out.println("The missingNumber is :"+diff);  
        }

        
    }

