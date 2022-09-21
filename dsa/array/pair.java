package dsa.array;
///interview question 2;


import java.util.Arrays;

public class pair {
    // Pairs or Two Sums
    public static void main(String[] args) {
        int[] num = { 2, 8, 15, 29 };
        pair pr = new pair();
        int[] result = pr.Pairs(num, 17);
        System.out.println(Arrays.toString(result));

    }

    /**
     * @param number
     * @param target
     * @return
     */
    public int[] Pairs(int[] number, int target) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    return new int[] { i, j };

                }

            }

        }
        throw new IllegalArgumentException("no solution found");

    }

}
