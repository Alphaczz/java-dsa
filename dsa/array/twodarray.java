package dsa.array;

import java.util.Arrays;

public class twodarray {
  
    public static void main(String[] args) {
        int [][] array;//----declare <--step 1
        array =new int[2][2];//----instantialize<--sstep 2
      //step3---> initialize
      array[0][0]=1;
      array[0][1]=1; 
      array[1][0]=1;
      array[1][1]=Integer.MIN_VALUE;
         //it takes O(mn) time complexity..........

      //////////////////////////////////////
      System.out.println(Arrays.deepToString(array));

      String s2darray[][]={{"a","b"},{"c","d"}};
      System.out.println(Arrays.deepToString(s2darray));
        //it takes O(1) time complexity..........

        /////insertion
        
        twodarray arr = new twodarray(3,3);
        arr.insertvalue(0, 0, 12);
        arr.insertvalue(0, 1, 11);
        arr.insertvalue(0, 3, 12);
        System.out.println(Arrays.deepToString(arr.array1));
        arr.accessarry(0, 0);
        arr.accessarry(1, 0);
        arr.traverseArray2d();
        arr.searchingValue(12);
        arr.deletearray(11);
        
   
    }
    int[][] array1;
    //constructor 
    public twodarray(int numberOfRows,int numberOfColumns) {
        this.array1= new int[numberOfRows][numberOfColumns];
        for ( int row = 0; row < array1.length; row++) {
            for (int col = 0; col < array1.length; col++) 
            {
               array1[row][col]=Integer.MIN_VALUE;   
            }
            
        }
    }
    public void insertvalue(int row,int col,int value) {
        try {
            if(array1[row][col]==Integer.MIN_VALUE){
                array1[row][col]=value;
                System.out.println("value inserted");
            }else{
                System.out.println("already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) 
        {
           System.out.println("out of bound");
           
        }
        
    }
    // access a array
    public void accessarry(int row ,int col)
   {
    System.out.println("\nrow number is#"+row+"col No#"+col);
   try {System.out.println("cell value"+ array1[row][col]);

    
   } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("invalid index");
   }

   }  
   public void traverseArray2d() {
    for (int row = 0; row < array1.length; row++) {
        for (int col = 0; col < array1.length; col++) {
            System.out.println(array1[row][col]+" ");
            
        }
        System.out.println();
        
    }
    
   }
   public void searchingValue(int value) {
    for (int row = 0; row < array1.length; row++) {
        for (int col = 0; col < array1.length; col++) {
            if (array1[row][col]==value) {
                System.out.println("value is found:"+row+" "+col);
                return;
                
                
            }
            else{System.out.println("value not found!");}
            
        }
        
    }
    
   }
   public void deletearray(int value){
    for (int row = 0; row < array1.length; row++) {
        for (int col = 0; col < array1.length; col++) {
            if (array1[row][col]==value) {
                array1[row][col]=Integer.MIN_VALUE;
                System.out.println("deleted successfully");
                return;
                
            }
            else{System.out.println("not found");}
            
        }
        
    }
   }
    
}
