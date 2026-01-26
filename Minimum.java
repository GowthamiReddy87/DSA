public class Minimum
{
static int min(int arr[])
{
int smallest=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++)
{
if(arr[i]<smallest)
{
smallest=arr[i];
}
}
return smallest;
}
public static void main(String[] args)
{
int arr[]={1,6,9,8,10};
System.out.println(min(arr));
}
}
