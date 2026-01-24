class Linear
{
public static void main(String[] ar)
{
int arr[]={4,7,1,9,3};
int search=9;
boolean found=false;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==search)
{
System.out.println("found at index "+i);
found=true;
break;
}
}
if(!found)
{
System.out.println("Not found");
}
}
}