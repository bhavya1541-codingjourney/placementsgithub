class UpperBound
{
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40,50,60,70,80};
        int start=0, end= arr.length-1,target=55,position=-1;
        while(start <= end)
        {
            int mid =start + (end-start)/2;
            if(arr[mid]<=target)  
            {
              start=mid+1;
            }
            if(arr[mid]>target)
            {
                position=mid;
                end=mid-1;
            }

        }System.err.println("upper bound index: "+position);
    }
}