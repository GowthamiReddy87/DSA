public class MissingNumberUsingSumFormula
{
public static void main(String[] args)
{
int arr[]={1,2,3,4};
int n=arr.length+1;
int sum=n*(n+1)/2;
int add=0;
for(int i=0;i<arr.length;i++)
{
add+=arr[i];
}
int missnum=sum-add;
System.out.println(missnum);
}
}