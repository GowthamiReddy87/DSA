class PrefixSum
{
public static void main(String[] ar)
{
int arr[]={3,1,4,2,5};
int prefix[]=new int[arr.length];
int l=1;
int r=3;
prefix[0]=arr[0];
int sum;
for(int i=1;i<arr.length;i++)
{
prefix[i]=prefix[i-1]+arr[i];
}
if(l==0)
{
sum=prefix[r];
}
else
{
sum=prefix[r] - prefix[l-1];
}
System.out.println(sum);
}
}