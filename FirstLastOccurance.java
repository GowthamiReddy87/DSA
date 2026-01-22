class FirstLastOccurance
{
public static void main(String[] args)
{
int[] arr={5,3,7,3,9,3,1};
int first=-1;
int last=-1;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==3)
{
if(first==-1)
{
first=i;
}
last=i;
}
}
System.out.println("first occurance "+first);
System.out.println("last occurance "+last);
}
}