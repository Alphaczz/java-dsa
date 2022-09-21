package dsa.array;

public class findTheNumber {
    public static void main(String[] args) {
        int[] ArrayNo={1,2,3,33,221,112,233};
        findTheNumber ftn=new findTheNumber();
        ftn.findTheNo(ArrayNo, 221);
        
        
    }
    public void findTheNo(int[] ArrayNo,int value) {
        for (int i = 0; i < ArrayNo.length; i++) {
            if (ArrayNo[i]==value) {
                System.out.println("Number Found at position "+i);
                return;
            }
           
        }
        System.out.println("Not Found");
        
    }
}
