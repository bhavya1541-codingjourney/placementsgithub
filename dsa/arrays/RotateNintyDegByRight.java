import java.util.*;
class RotateNintyDegByRight
{
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
           int[][] ak =new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                ak[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<ak.length;i++)
        {
            for(int j=ak.length-1;j>=0;j--)
            {
               System.out.print(ak[i][j]);
            }System.out.println();
        }
    }
}