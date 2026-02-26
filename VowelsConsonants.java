public class VowelsConsonants
{
public static String vowelscons(String s)
{
char[] arr=s.toCharArray();
int vowelcount=0;
int conscount=0;
for(int i=0;i<arr.length;i++)
{
if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
{
vowelcount++;
}
else 
{
conscount++;
}
}
return "vowels:"+vowelcount+" cons:"+conscount;
}
public static void main(String[] args)
{
String s="gowthu";
System.out.println(vowelscons(s));
}
}