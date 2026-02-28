public class DistnictLarge2
{
public static int large(int arr[])
{
int large=arr[0];
int seclarge=Integer.MIN_VALUE;
int count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>large)
{
seclarge=large;
large=arr[i];
}
else if(seclarge<arr[i]&&arr[i]!=large)
{
seclarge=arr[i];
}
}
for(int i=0;i<arr.length;i++)
{
if(arr[i]==seclarge)
{
count++;
}
}
if(count>1)
{
return -1;
}
return seclarge;
}
public static void main(String[] args)
{
int arr[]={-5, -2, -9, -1,-2};
System.out.println(large(arr));
}
}