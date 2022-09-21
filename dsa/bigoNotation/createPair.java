package dsa.bigoNotation;

public class createPair {

   public static void main(String[] args){
    int[] customarray={1,2,3,4,5};
    createPair finalcall=new createPair();
    finalcall.method(customarray);
   }
    
   public void method(int[] array){
    for (int i = 0; i < array.length; i++) {//-----------O(N)-----|__________O(N^2)
        for (int j = 0; j < array.length; j++) {//------O(N)------|
            System.out.println(array[i]+""+array[j]);/////---------O(1)
            
        }
        ////complexity is O(N^2) for the function....///////
    }

    }
}