class Linearcount
{
public static void main(String[] ar)
{
int arr[]={2,5,2,8,2,9};
int count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==2)
{
count++;
}
}
System.out.println(count);
}
}