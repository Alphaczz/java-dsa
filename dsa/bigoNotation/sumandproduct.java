package dsa.bigoNotation;


public class sumandproduct{
    public static void main(String[] args)
	{
        int[] no={1,21,21,44};
       sumandproduct answer= new sumandproduct();
       answer.method(no);
        
    }
   
    

public void method(int[] array) {
    int sum =0;        //-------------------------------------(O(1))
    int product=1;     //-------------------------------------(O(1))
    for (int i = 0; i < array.length; i++) //-----------------(O(N))
    {sum += array[i];}                     //-----------------(O(1))
    for (int i = 0; i < array.length; i++) { //-------------- (O(N))
        product *= array[i];//----------------------------------O(1)
    }
    System.out.println(sum+","+product);//--------O(1)
}
}
//--the complexity of the function is|| O(N) ||.-----------------//