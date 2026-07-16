// Problem: find the pivot element in the array 
// Approach: 2 pointer type
// Time Complexity:  O(n)  
// Space Complexity:  O(n) +O(n) =O(n) 
// Author: Bhavya

class FindThePivotElement
{
    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        int[] leftsum = new int[arr.length];
        leftsum[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            leftsum[i]=leftsum[i-1]+arr[i];
        }
        int[] rightsum= new int[arr.length];
        rightsum[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            rightsum[i]=rightsum[i+1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
           if(leftsum[i]==rightsum[i])
           {
            System.out.println("pivot index is:"+i+"\t pivot element is: "+arr[i]);
           }
        }
    }
}