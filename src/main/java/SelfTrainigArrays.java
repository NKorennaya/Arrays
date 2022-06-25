import java.util.ArrayList;
import java.util.Arrays;

public class SelfTrainigArrays {public static void main(String[] args) {

    //  SelfTrainigArrays has22 = new SelfTrainigArrays();
    //  System.out.println(has22.has22(new int[]{1, 2, 2}));

    //  SelfTrainigArrays lucky13 = new SelfTrainigArrays();
    //  System.out.println(lucky13.lucky13(new int[]{2, 1, 3}));

    //  SelfTrainigArrays maxTriple = new SelfTrainigArrays();
    //  System.out.println(maxTriple.maxTriple(new int[]{4, 1, 3}));

    //  SelfTrainigArrays arrayFront9 = new SelfTrainigArrays();
    // System.out.println(arrayFront9.arrayFront9(new int[]{4, 1, 3, 9}));

    SelfTrainigArrays square = new SelfTrainigArrays();
    System.out.println(square.square());

}

    //===============================1=======================================================
    public boolean has22(int[] nums) {
        //int[] nums = {2, 2, 1};
        int length = nums.length;
        System.out.println(Arrays.toString(nums));
        if (length == 0) {
            return false;
        } else {
            for (int i = 0; i < length - 1; i++) {
                if (nums[i] == 2) {
                    i++;
                    if (nums[i] == 2) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    //===============================2=====================================================================
    public boolean lucky13(int[] input) {
        int length = input.length;
        System.out.println(Arrays.toString(input));
        boolean result = true;
        for (int i = 0; i < length; i++)
            if (input[i] == 1 || input[i] == 3) {
                result = false;
            }
        return result;

    }
//==================================3======================================================================

    public int maxTriple(int[] values) {
        int max = values[0];

        if (max < values[values.length / 2])
            max = values[values.length / 2];

        if (max < values[values.length - 1])
            max = values[values.length - 1];

        return max;
    }

    //=============================4===================================================================
    public boolean arrayFront9(int[] num) {
        int length = num.length - 1;
        System.out.println(Arrays.toString(num));
        boolean result = false;
        for (int i = 0; i < length; i++)
            if (num[i] == 9) {
                result = true;
            }
        return result;

    }

    //=================================5=================================================

    public ArrayList<Integer> square() {
        ArrayList<Integer> square = new ArrayList<Integer>();
        square.add(2);
        square.add(1);
        square.add(3);
        square.add(8);

        System.out.println("The input is: " + square);

        square.replaceAll(n -> n * n);
        return square;
    }

}





