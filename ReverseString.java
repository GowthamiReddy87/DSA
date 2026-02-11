public class ReverseString
{
public static void reverse(char arr[])
{
for(int i=arr.length-1;i>=0;i--)
{
System.out.print(arr[i]);
}
}
public static void main(String[] args)
{
String s="gowthu";
char[] arr=s.toCharArray();
reverse(arr);
}
}