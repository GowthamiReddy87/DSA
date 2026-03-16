public class MinimumSumSubArray {
    public static void main(String[] args) {

        int[] arr = {2,1,5,1,3,2};
        int k = 3;

        int sum = 0;

        for(int i=0;i<k;i++)
            sum += arr[i];

        int min = sum;

        for(int i=k;i<arr.length;i++){
            sum += arr[i];
          sum -= arr[i-k];
            min = Math.min(min,sum);
        }

        System.out.println(min);
    }

}