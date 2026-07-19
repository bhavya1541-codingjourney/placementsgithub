// Problem: Print the wave pattern in the matrix
// Approach: bruteforce  with 2 conditions
// Time Complexity:  O(n square)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya


// import java.util.*;
class WavePrintMatrix
{
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr[0].length;i++)
        {
            if((i&1) ==0)     // ever even number has 0 at last in bitwise representation when we do 0&1 ==0  this is the check for the even number
            {
              for(int j=0;j<arr.length;j++)
              {
                System.out.print(arr[j][i]+" \t ");
              }
            }
            if((i&1)==1)
            {
                for(int j=arr.length-1;j>=0;j--)
                {
                    System.out.print(arr[j][i]+ "\t");
                }
            }
        }
    }
}