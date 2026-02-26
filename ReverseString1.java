public class ReverseString1
{
public static void reverse(String s)
{
char[] arr=s.toCharArray();
for(int i=arr.length-1;i>=0;i--)
{
System.out.print(arr[i]);
}
}
public static void main(String[] args)
{
String s="gowthu";
reverse(s);
}
}