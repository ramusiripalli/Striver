/*
Count Maximum Consecutive One’s in the array
Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

Examples:

Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Input: prices = {1, 0, 1, 1, 0, 1} 

Output: 2

Explanation: There are two consecutive 1's in the array. 
*/

public class Main {

    public static int Ones(int[] array) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);

        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };
        int number = Ones(array);
        System.out.println("The max number of ones is " + number);
    }
}
