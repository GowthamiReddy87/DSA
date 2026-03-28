public class SlidingWindow
{
public static int slide(int arr[],int k)
{
if(k>arr.length)
return -1;
int sum=0;
int max=0;
for(int i=0;i<k;i++)
{
sum+=arr[i];
}
max=sum;
for(int i=k;i<arr.length;i++)
{
sum +=arr[i];
sum-=arr[i-k];
max=Math.max(max,sum);
}
return max;
}
public static void main(String[] args)
{
int arr[]={2,1,5,1,3,2};
int k=3;
System.out.println(slide(arr,k));
}
}