public class Kandane
{
public static int sum(int arr[]) {
int currentSum=arr[0];
int maxSum=arr[0];
for(int i=1;i<arr.length;i++) {
currentSum=Math.max(arr[i], currentSum + arr[i]);
maxSum=Math.max(maxSum,currentSum);
}
return maxSum;
}
public static void main(String[] args)
{
int arr[]={4,-2,3,-6,9,4};
System.out.println(sum(arr));
}
}