class LowerBound
{
    public static void main(String[] args) {
        int arr[]={10,20,30,30,30,30,30,40,40,40};
        int start=0,end= arr.length-1, target=40,position=-1;
        while(start<=end)
        {
            int mid= start+ (end - start)/2;
            if(arr[mid]>=target)
            {
                position=mid;
                end=mid-1;
            }
            if(target>arr[mid])
            {
                start=mid+1;
            }
        }System.err.println("lower bound index is: "+position);
    }
}