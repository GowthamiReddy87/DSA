public class Maximum
{
static int max(int arr[])
{
int largest=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>largest)
{
largest=arr[i];
}
}
return largest;
}
public static void main(String[] args)
{
int arr[]={1,6,9,8,10};
System.out.println(max(arr));
}
}
