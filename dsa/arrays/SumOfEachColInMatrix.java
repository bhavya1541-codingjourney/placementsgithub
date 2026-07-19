// Problem: sum of each collumn in the matrix i.e. 2d array
// Approach: bruteforce  
// Time Complexity:  O(n square)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya


// import java.util.*;
class SumOfEachColInMatrix
{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int j=0;j<arr[0].length;j++)
        {  int sumcol=0;
          for(int i=0;i<arr.length;i++)
          {
            sumcol+=arr[i][j];
          } System.out.println(sumcol);
        }
    }
}