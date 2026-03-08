public class Numbers
{
static void num(int n)
{
if(n==0)
return ;
num(n-1);
System.out.println(n);
}
public static void main(String[] args)
{
int n=4;
num(n);
}
}