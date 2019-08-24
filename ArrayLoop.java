public class ArrayLoop
{
    public static void main(String[] args)
    {
        int arr[]={12,13,14,15,16,78};
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(arr[j]);
            }
            System.out.println(" ");
        }
    }
}
