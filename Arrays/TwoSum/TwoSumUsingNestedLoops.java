public class TwoSumUsingNestedLoops
{
public static void main(String[] args)
{
int arr[]={11,15,2,7};
int target=9;
boolean found=false;
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(i!=j)
{
if(arr[i]+arr[j]==target)
{
System.out.println(i+" "+j);
found=true;
break;
}
}
}
if(found)
{
break;}
}
}
}