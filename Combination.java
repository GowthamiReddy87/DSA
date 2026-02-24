public class Combination {

    public static int checkArray(int arr[]) {

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] <= arr[i-1]) {
                increasing = false;
            }

            if(arr[i] >= arr[i-1]) {
                decreasing = false;
            }
        }

        if(increasing) {
            return 1;
        }
        else if(decreasing) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2};
        System.out.println(checkArray(arr));
    }
}