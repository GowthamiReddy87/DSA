class LoopOccurance
{
public static void main(String[] args)
{
int arr[]={1,2,3,2,4,2};
int first=-1;
int last=-1;
Boolean found=false;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==2)
{
if(first==-1)
{
first=i;
}
last=i;

found=true;
}
}
if(!found)
{
System.out.println("element not found");
}
System.out.println("first occurance="+first);
System.out.println("last occurance="+last);
}
}