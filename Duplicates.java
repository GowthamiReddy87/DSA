public class Duplicates
{
public static void remove(int arr[])
{
int j=0;
for(int i=1;i<arr.length;i++)
{
if(arr[i]!=arr[j])
{
j++;
arr[j]=arr[i];
}
}
for(int i=0;i<=j;i++)
{
System.out.print(arr[i]+" ");
}
}
public static void main(String[] args)
{
int arr[]={1,1,2,2,3};
remove(arr);
}
}l