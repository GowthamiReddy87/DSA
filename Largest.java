class Largest
{
public static void main(String[] ar)
{
int arr[]={12,35,1,10,34,1};
int largest=arr[0];
int secondlargest=-1;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>largest)
{
secondlargest=largest;
largest=arr[i];
}
else if (arr[i] < largest && arr[i] > secondlargest) {
secondlargest = arr[i];
}
}
System.out.println("Largest: " + largest);
System.out.println("Second Largest: " + secondlargest);
}
}