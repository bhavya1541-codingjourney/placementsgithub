// Problem: Multiply each element of array by 10 then return new array
// Approach: bruteforce  
// Time Complexity:  O(n)  
// Space Complexity:  O(n)  because new array was created.
// Author: Bhavya

import java.util.*;

class MultiplyEachElementOfArrayByTen
{
    public static int[] multiplybyten(int[] arr)
    {
        int[] ag = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            ag[i] = arr[i] * 10;
        }

        return ag;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};

        System.out.println("The old array: " + Arrays.toString(arr));

        int[] newarr = multiplybyten(arr);

        System.out.println("The new array: " + Arrays.toString(newarr));
    }
}