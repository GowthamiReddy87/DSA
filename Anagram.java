import java.util.Arrays;
public class Anagram
{
public static void anagram(String s,String d)
{
if(s.length()!=d.length())
{
System.out.println("not anagram");
return;
}
char[] arr=s.toCharArray();
char[] arr1=d.toCharArray();
Arrays.sort(arr);
Arrays.sort(arr1);
if(Arrays.equals(arr,arr1)) 
{
System.out.println("Anagram");
} 
else 
{
System.out.println("Not anagram");
}
}
public static void main(String[] args)
{
String s="listn";
String d="silent";
anagram(s,d);
}
}