package dsa.array;


// interview question 
//find max product from given array;

public class maxProduct {
    public static void main(String[] args) {
        int[] arrayOfNum={10,20,30,40};
        maxProduct mp=new maxProduct();
        mp.maxPro(arrayOfNum);
        
    }
    public String maxPro(int[] arrayint) 
    {int maxPr=0;String pairs="";
        for (int i = 0; i < arrayint.length; i++) {
            for (int j =i+1; j < arrayint.length; j++) {
                if(arrayint[i]*arrayint[j]>maxPr)
                {
                     maxPr=arrayint[i]*arrayint[j];
                     pairs= Integer.toString(i)+","+Integer.toString(j);

                }
            }
        }System.out.println("max product is : "+maxPr);  
         System.out.println(pairs);
        return pairs;
     
        
    }
}
