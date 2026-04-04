public class AllCount
{
public static String count(String s)
{
int digit=0;
int letter=0;
int special=0;
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(Character.isDigit(ch))
{
digit++;
}
else if(Character.isLetter(ch))
{
letter++;
}
else
{
special++;
}
}
return "digits: "+digit+" letters: "+letter+" special:"+special;
}
public static void main(String[] args)
{
String s="a1b2c3@45";
System.out.println(count(s));
}
}