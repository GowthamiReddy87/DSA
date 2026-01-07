class ArrayAll
{
public static void main(String[] args)
{
int[] arr = {3, 7, 2, 9, 4, 6};
int max=arr[0];
int min=arr[0];
int sum=0;
int count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
if(arr[i]<min)
{
min=arr[i];
}

sum +=arr[i];
if(arr[i]%2==0)
{
count++;
}
}
System.out.println(min);
System.out.println(max);
System.out.println(sum);
System.out.println(count);
}
}