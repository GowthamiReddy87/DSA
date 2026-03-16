public class CountSubArray
{
public static void main(String[] args)
{
int arr[]={1,2,3,2,2};
int k=2;
int target=5;
int count=0;
int sum=0;
for(int i=0;i<k;i++)
{
sum +=arr[i];
}
if(sum==target)
count++;
for(int i=k;i<arr.length;i++)
{
sum +=arr[i];
sum -=arr[i-k];
if(sum==target)
count++;
}
System.out.println(count);
}
}