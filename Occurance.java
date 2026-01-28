class Occurance
{
public static void main(String[] args)
{
int[] arr={1,2,3,4,5};
int first=-1;
int last=-1;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==6)
{
if(first==-1)
{
first=i;
}
last=i;
}
}
if(first==-1)
{
System.out.println("element not found");
}
else
{
System.out.println("first occurance "+first);
System.out.println("last occurance "+last);
}
}
}