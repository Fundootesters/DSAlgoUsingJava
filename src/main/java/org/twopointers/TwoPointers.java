package org.twopointers;

public class TwoPointers {

    private static int[] twoSum(int[] num, int target){

        int start = 0;
        int end = num.length-1;
        int a,b;

        while (start<end){
            a = num[start];
            b = num[end];

            if(a+b == target) break;
            if(a+b < target){
                start++;
            }else if (a + b >target){
                end --;
            }
        }


        return new int[]{start + 1, end +1};
    }


    public static void main(String[] args) {

        int input[] = {2,7,11,19};
        int target = 21;

        int[] output = twoSum(input, target);

        System.out.println("First value is " + output[0]);
        System.out.println("Second value is " + output[1]);
    }
}
