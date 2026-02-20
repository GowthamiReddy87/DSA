class Frequency1
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
int maxfreq=-1;
int secondfreq=-1;
int mostfreq=Integer.MIN_VALUE;
int secondmostfreq=Integer.MIN_VALUE;
for(int i=0;i<freq.length;i++)
{
if(freq[i]>0)
{
if(freq[i] > maxfreq) 
{
secondfreq = maxfreq;
secondmostfreq = mostfreq;
maxfreq = freq[i];
mostfreq = i;
}
else if(freq[i]<maxfreq && freq[i]>secondfreq)
{
secondfreq=freq[i];
secondmostfreq=i;
}
} 
}
System.out.println(mostfreq+" is most frequent");
System.out.println(secondmostfreq+" is second most frequent");
}
}