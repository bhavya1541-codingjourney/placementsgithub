// Problem: Remove duplicates from the sorted array
// Approach: 2 pointer
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya
class RemoveDuplicatesFromSortedArray
{
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,3,4}; int i=0, j=1;
        while(j<arr.length)
        {
            if(arr[i]==arr[j])
            {
               j++;
            }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        System.err.println(i+1);
    }
}