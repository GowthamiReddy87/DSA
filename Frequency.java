class Frequency
{
public static void main(String[] ar)
{
int arr[]={4,1,2,4,3,1,4};
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
}
int freq[]=new int[max+1];
for(int i=0;i<arr.length;i++)
{
freq[arr[i]]++;
}
for(int i=0;i<freq.length;i++)
{
if(freq[i]>0)
{
System.out.println(i+" occurs "+freq[i]+" times");
}
}
}
}