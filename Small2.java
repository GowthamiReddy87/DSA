public class Small2
{
public static int small(int arr[])
{
int small=arr[0];
int secsmall=Integer.MAX_VALUE;
if(arr.length < 2) {
return -1; 
}
for(int i=1;i<arr.length;i++)
{
if(arr[i]<small)
{
secsmall=small;
small=arr[i];
}
else if(secsmall>arr[i]&&arr[i]!=small)
{
secsmall=arr[i];
}
}
if(secsmall==Integer.MAX_VALUE)
{
return -1;
}
return secsmall;
}
public static void main(String[] args)
{
int arr[]={4,2,7,1,9};
System.out.println(small(arr));
}
}