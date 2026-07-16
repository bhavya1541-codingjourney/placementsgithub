// Problem: 3 sum
// Approach: brute force
// Time Complexity:  O(n^3)  
// Space Complexity:  O(n) no extra space taken 
// Author: Bhavya

import java.util.*;

class ThreeSum {

    public List<List<Integer>> threesum(int[] arr) {
       List<List<Integer>> lists = new ArrayList<>();int target=10;
       for (int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++)
          {
            for(int k=j+1;k<arr.length;k++)     
            {
                  if(arr[i]+arr[j]+arr[k]==target)
                  {
                    List<Integer> mg=new ArrayList<>();
                    mg.add(arr[i]);
                    mg.add(arr[j]);
                    mg.add(arr[k]);
                   Collections.sort(mg);
                   lists.add(mg);
                  }
            }    
          } 
       }return lists;
    }
}
