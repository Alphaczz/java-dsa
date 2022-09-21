package dsa.recurssion;
class decimalToBinary {
    public static void main(String[] args) {
      decimalToBinary main = new decimalToBinary();
      var result = main.decimaltoBinary(100);
      System.out.println(result);
  
    }
  
    // Question 4 - Decimal to Binary
  
    public int decimaltoBinary(int n) {
      if (n==0) {
        return 0;
      }
      return n%2 + 10*decimaltoBinary(n/2);
    }
  
  
  }