
class MissingElementsFromAnArrayOfDuplicates
{
    public static void main(String[] args) {
        int arr[]={1,4,4,5,2,2};  // range = all natural numbers i.e. nums>0

        for(int i=0;i <arr.length;i++)
        {
            int value=Math.abs(arr[i]);
            int position= value-1;
            if(arr[position]>0)
            {
              arr[position]=-arr[position];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                System.out.println(i+1);
            }
        }

    }
}