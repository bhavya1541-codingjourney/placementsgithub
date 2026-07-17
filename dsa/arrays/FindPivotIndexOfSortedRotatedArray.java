class FindPivotIndexOfSortedRotatedArray
{
    public static void main(String[] args) {
        int arr[]={50,60,70,90,10,20,30,40,50};
        int start=0,end=arr.length-1,position=-1,lastelement=arr[arr.length-1];
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]<lastelement)
            {
                end=mid-1;
            }
            if(arr[mid]>=lastelement)
            {
                position=mid;
                start=mid+1;
            }
        }System.err.println("the position of the pivot element in array is: "+position);
    }
}