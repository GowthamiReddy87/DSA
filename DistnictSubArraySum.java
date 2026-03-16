public class DistnictSubArraySum {
    public static void main(String[] args) {

        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;

        int sum = 0;


        for(int i=0;i<k;i++)
            sum += arr[i];

        int max = sum;

        for(int i=k;i<arr.length-2;i++){
            sum += arr[i];
          sum -= arr[i-k];
            max = Math.max(max,sum);
        }

        System.out.println(max);
    }
}