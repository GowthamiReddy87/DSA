public class LongestSubArray
{
public static int longestSubarray(int arr[], int k) {
int sum = 0;
int maxLen = 0;
int j = 0;
for(int i = 0; i < arr.length; i++) {
sum += arr[i];
while(sum > k) {
sum -= arr[j];
j++;
}
maxLen = Math.max(maxLen, i - j + 1);
}
return maxLen;
}
public static void main(String[] args)
{
int arr[]={4,1,1,1,2,3,5};
int k=5;
System.out.println(longestSubarray(arr,k));
}
}