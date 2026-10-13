public class ArrayRotationRight
{
public static void array(int arr[],int k)
{
for(int j=0;j<k;j++)
{
int first=arr[arr.length-1];
for(int i=arr.length-1;i>0;i--)
{
arr[i]=arr[i-1];
}
arr[0]=first;
}
for(int x:arr)
{
System.out.print(x+" ");
}
}
public static void main(String[] args)
{
int arr[]={10,20,30,40,50};
array(arr,2);
}
}