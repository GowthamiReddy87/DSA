public class RemoveDuplicates2 {
    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3};

        int slow = 2;

        for(int fast = 2; fast < arr.length; fast++) {

            if(arr[fast] != arr[slow - 2]) {
                arr[slow] = arr[fast];
                slow++;
            }
        }

        for(int i = 0; i < slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}