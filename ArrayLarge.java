class ArrayLarge
{
public static void main(String[] ar)
{
int[] arr={12,45,7,89,23};
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max =arr[i];
}
}
System.out.println(max);
}
}
