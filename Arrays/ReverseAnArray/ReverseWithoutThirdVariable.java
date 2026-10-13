public class ReverseWithoutThirdVariable
{
public static void main(String[] args)
{
int arr[]={50,40,30,20,10};
int left=0;
int right=arr.length-1;
while(left<=right)
{
arr[left]=arr[left]+arr[right];
arr[right]=arr[left]-arr[right];
arr[left]=arr[left]-arr[right];
left++;
right--;
}
for(int x:arr)
{
System.out.print(x+" ");
}
}
}