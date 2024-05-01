package org.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    private static boolean containsDuplicats(int[] inputs){

        Set<Integer> data = new HashSet<>();

        for(int i =0; i<inputs.length; i++){
            if(data.contains(inputs[i])){
                return true;
            }
            data.add(inputs[i]);
        }
        return false;

    }


    public static void main(String[] args) {
        int[] inputs = {1,2,3,9,4,5,6};

        System.out.println(containsDuplicats(inputs));
    }
}
