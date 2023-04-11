package org.sorting;

public class BubbleSort {
    private static int[]  sortArray(int[] inputArray) {
        for (int lastIndex = inputArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    swapValues(inputArray, i, i + 1);
                    System.out.println("");
                }
            }
        }
        return inputArray;
    }

    private static void swapValues(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] arrayToSort = {3,90,-10,11,15,-88};
        int[] ouputArray = sortArray(arrayToSort);

        for (int i = 0; i < ouputArray.length; i++) {
            System.out.println("Value at index " + i+ " is -> " + ouputArray[i]);
        }
    }
}
