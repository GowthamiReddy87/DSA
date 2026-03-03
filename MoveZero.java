public class MoveZero
{
public static void move(int arr[])
{
int count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]!=0)
{
arr[count]=arr[i];
count++;
}
}
while(count<arr.length)
{
arr[count]=0;
count++;
}
for(int num:arr)
{
System.out.println(num);
}
}
public static void main(String[] args)
{
int arr[]={6,0,7,0,0,3};
move(arr);
}
}