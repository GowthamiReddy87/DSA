public class LongestSubArrayPrint
{
public static void longestSubarrayPrint(int arr[], int k) {
    int sum = 0;
    int maxLen = 0;
    int j = 0;

    int start = 0, end = 0;

    for(int i = 0; i < arr.length; i++) {
        sum += arr[i];

        while(sum > k) {
            sum -= arr[j];
            j++;
        }

        if(i - j + 1 > maxLen) {
            maxLen = i - j + 1;
            start = j;
            end = i;
        }
    }
for(int i = start; i <= end; i++) {
        System.out.print(arr[i] + " ");
    }
}
public static void main(String[] args)
{
int arr[]={4,1,1,1,2,3,5};
int k=5;
longestSubarrayPrint(arr,k);
}
}