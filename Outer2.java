class Outer2
{
static class Inner2
{
static void add(int a)
{
a++;
System.out.println(a);
}
}
public static void main(String[] args)
{
Outer2.Inner2.add(1);
}
}