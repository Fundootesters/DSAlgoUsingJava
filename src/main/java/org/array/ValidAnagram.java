package org.array;

public class ValidAnagram {

    private static boolean isAnagram(String input1, String input2){

        if(input1.length()!=input2.length()) return false;

        int[] store = new int[26];

        for(int i = 0; i<input1.length(); i++){
            store[input1.charAt(i) - 'a']++;
            store[input2.charAt(i) - 'a']--;
        }

        for(int n: store) if(n != 0) return false;

        return true;
    }


    public static void main(String[] args) {
        String input1 = "anagram";
        String input2 = "nagaram";
        System.out.println(isAnagram(input1, input2));

    }
}
