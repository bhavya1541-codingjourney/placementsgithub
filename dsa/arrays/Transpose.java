import java.util.*;
class Transpose
{
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ak = new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                ak[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(ak[i][j]+"\t");
            }System.out.println();
        }
    }
}