public class MoveZeros
{
    public static void moveZero(int arr[])
    {
        int j = 0; // position for next non-zero
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {0,0,1,2,3};
        moveZero(arr);

        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}