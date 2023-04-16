package org.sorting;

public class BubbleSort {

    //Origin: Initially, Bubble sort was referred to as “Sorting by exchange” in [1, 2] and further, it is
    // re-ferred to as “Exchange Sorting” in [3, 4]. The term “Bubble Sort ” was first used by Iverson in 1962 [5].

    // Understand via video
    // In Hindi: https://www.youtube.com/watch?v=0IVVxxG3eOk&list=PLuqnSAN_m8K28CMJ1WglKviPxP-ax18DE
    // In English: https://www.youtube.com/watch?v=udZtu7GIIhA&list=PLuqnSAN_m8K2GEvxrqEyR8aiPUHFdHF6Q
    private static int[]  sortArray(int[] inputArray) {
        for (int lastIndex = inputArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    swapValues(inputArray, i, i + 1);
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
