public class Lsearch
{
public static int search(int arr[],int target)
{
int index=-1;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==target)
{
index=i;
break;
}
}
return index;
}
public static void main(String[] args)
{
int arr[]={4,7,1,9,12,0};
int target=9;
System.out.println(search(arr,target));
}
}