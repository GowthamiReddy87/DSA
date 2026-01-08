class ArrayEven
{
public static void main(String[] ar)
{
int count=0;
int[] arr={1,2,3,4,5,6};
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
{
count++;
}
}
System.out.println(count);
}
}
