class Largest1
{
public static void main(String[] ar)
{
int arr[]={1,2};
int largest=arr[0];
int secondlargest=-1;
for(int i=1;i<arr.length;i++)
{
if(arr[i]>largest)
{
secondlargest=largest;
largest=arr[i];
}
}
System.out.println("Largest: " + largest);
System.out.println("Second Largest: " + secondlargest);
}
}
