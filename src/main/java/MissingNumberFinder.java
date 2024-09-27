import java.util.Arrays;

public class MissingNumberFinder {

    public static int findMissingNumber(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        Arrays.sort(array);
        int expectedNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expectedNumber) {
                return expectedNumber;
            }
            expectedNumber++;
        }
        return expectedNumber;
    }
}

//        General
//    Write a function as described below and test scenarios to test its validity.
//        Details
//        Write a function that finds missing number in array:
//        Given array of sequent numbers 0,1,2,3...N with missing member
//        Function finds a first missing number occurrence in the sequence.
//        Example:
//        Input: [5,0,1,3,2]
//        Output: 4
//        Input: [7, 9,10, 11, 12]
//        Output: 8
//        Implement the function + tests and explain your thinking and assumptions as comments.
//        You can send the solution as a link to github (or similar)
//        Note:
//        1- Think of every possible scenario to test your function including corner cases.
//        2- Solutions in email will not be accepted.
