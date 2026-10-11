public class ArrayRotation
{
public static void array(int arr[],int k)
{
for(int j=0;j<k;j++)
{
int first=arr[0];
for(int i=0;i<arr.length-1;i++)
{
arr[i]=arr[i+1];
}
arr[arr.length-1]=first;
}
for(int x:arr)
{
System.out.print(x+" ");
}
}
public static void main(String[] args)
{
int arr[]={1,2,3,4,5};
array(arr,3);
}
}