class PrefixFreq
{
public static void main(String[] ar)
{
int arr[] = {1, 2, 1, 3, 2, 1, 4, 2};
int l=0;
int r=3;
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