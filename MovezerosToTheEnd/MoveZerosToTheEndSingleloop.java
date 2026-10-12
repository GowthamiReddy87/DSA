public class MoveZerosToTheEndSingleloop
{
public static void main(String[] args)
{
int arr[]={1,0,2,0,3};
int j=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]!=0)
{
arr[j]=arr[i];
if(i!=j){
arr[i]=0;}
j++;
}
}
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
}
