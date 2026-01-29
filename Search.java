class Search
{
public static void main(String[] ar)
{
int arr[]={1,2,3,4,5,6};
Boolean found=false;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==5)
{
System.out.println("found");
found=true;
break;
}
}
if(!found)
{
System.out.println("not found");
}
}
}