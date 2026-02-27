public class Largest2
{
public static int large(int arr[]){
if(arr.length<2)
{
return -1;
}
int large=arr[1];
int seclarge=arr[0];
for(int i=2;i<arr.length;i++)
{
if(arr[i]>large)
{
seclarge=large;
large=arr[i];
}
else if(seclarge<arr[i]&&arr[i]!=large)
{
seclarge=arr[i];
}
}
return seclarge;
}
public static void main(String[] args)
{
int arr[]={5,8,3,10};
System.out.println(large(arr));
}
}