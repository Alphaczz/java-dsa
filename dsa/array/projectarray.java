package dsa.array;

import java.util.Scanner;

public class projectarray {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("How many days temperature??");
        int numOfDays=sc.nextInt();
        int[] temperature=new int[numOfDays];//record temp and find avg
        int sum=0;
        for (int i = 0; i <numOfDays; i++) {
            System.out.println("day "+(i+1)+"'s high temp");
            temperature[i]=sc.nextInt();
            sum+=temperature[i];
        }
        double avg=sum/numOfDays;
        //days count above avg
        int count=0;
        for (int i = 0; i <temperature.length; i++) {
            if (temperature[i] > avg) {
                count++;
            }
           
        }
        System.out.println();
        System.out.println("Average temp= "+avg);
        System.out.println("days above avg temp is: "+count);
    }

   }


}
