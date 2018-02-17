package com.problems;

import java.util.HashMap;
import java.util.Map;

public class Vacation {

    private static int findShortest(int[] array, int n) {
        if (array.length != n)
            throw new RuntimeException("Wrong input!");

        // Amount of each unique item
        Map<Integer, Integer> noOfOccurances = new HashMap<>();
        for (int i=0;i<array.length;i++) {
            noOfOccurances.put(array[i], noOfOccurances.getOrDefault(i, 0) + 1);
        }

        // Total amount of unique items
        int uniquesCount = noOfOccurances.size();

        int minLengthRecord = n;
        int startIndex = 0;
        int endIndex = 0;
        int frequenciesInWindow = 0;
        int[] window = new int[n];

        // Nested while loop is limited by start, which is always less than n
        while (endIndex < n) {
            int endVal = array[endIndex];

            if (window[endVal] == 0) {
                // increment for every new unique item in window
                frequenciesInWindow++;
            }
            window[endVal]++;

            if (frequenciesInWindow == uniquesCount) {
                int startVal = array[startIndex];
                while (window[startVal] > 1) {
                    window[startVal]--;
                    startIndex++;
                    startVal = array[startIndex];
                }
                minLengthRecord = Math.min(minLengthRecord, endIndex - startIndex + 1);
            }
            endIndex++;
        }
        
        return minLengthRecord;
    }

    

 
    public static void main(String[] args) {
      

            
            int[] a = {7,5,2,7,2,7,4,7};
            int solution = findShortest(a,a.length);
            System.out.println(solution);
            

        
    }

}