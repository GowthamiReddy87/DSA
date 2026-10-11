public class ArrayRotationOptimisedRight
{
public static void array(int arr[],int k)
{
int left=0;
int right=arr.length-1;
while(left<right)
{
int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
left=k;
right=arr.length-1;
while(left<right)
{
int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
left=0;
right=k-1;
while(left<right){
int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
for(int x:arr)
{
System.out.print(x+" ");
}
}
public static void main(String[] args)
{
int arr[]={1,2,3,4,5};
array(arr,2);
}
}