// Problem: 2 sum 
// Approach: hashmap
// Time Complexity:  O(n)  
// Space Complexity:  O(n)  
// Author: Bhavya

import java.util.*;
class Twosum_hashmap
{
    public static void main(String[] args) {
        int arr[]={1,8,4,3,9,10,15},target=25;
        Map<Integer,Integer> maps = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int need=target-arr[i];
            if(maps.containsKey(need))
            {
                System.out.println(arr[i]+"+"+need+"="+target); break;
            }
            else
            {
                maps.put(arr[i],arr[i]);
            }
        }
    
    }
    
}