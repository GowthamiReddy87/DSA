class Sort
{
public static void main(String[] args)
{
int arr[]={1,2,3,5,4};
boolean sort=true;
for(int i=0;i<arr.length-1;i++)
{
if(arr[i]>arr[i+1])
{
sort=false;
break;
}
}
if(sort)
{
System.out.println("sorted");
}
else
{
System.out.println("not sorted");
}
}
}