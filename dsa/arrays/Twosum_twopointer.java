// Problem: 2 sum 
// Approach: 2 pointer
// Time Complexity:  O(n)  
// Space Complexity:  O(1)  
// Author: Bhavya

import java.util.Arrays;

class Twosum_twopointer {

    public static void main(String[] args) {
      int arr[] = {1, 2, 4, 6, 9} ,temp = 10,mg=-1;
        if (arr.length == 0) {
            System.out.println("array is empty:");
            System.exit(0);
        }
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;
        while (start < end) {
            
            if (arr[start] + arr[end] == temp) {
                mg=0;
                System.out.println(arr[start] + "+" + arr[end] + "=" + temp);
                break;
            }
            else if((arr[start]+arr[end]) <temp)
            {
                start++;
            }
            else if(arr[start]+arr[end]> temp)
            {
                end--;
            }
           
        }
        if(mg== -1)
        {
            System.err.println("no pair exists");
        }
    }
}
