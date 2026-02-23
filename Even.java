public class Even
{
public static int even(int arr[])
{
int count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
{
count++;
}
}
return count;
}
public static void main(String[] args)
{
int arr[]={1,2,3,4,5};
System.out.println(even(arr));
}
}