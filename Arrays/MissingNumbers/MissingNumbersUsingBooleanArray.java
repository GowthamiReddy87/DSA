
public class MissingNumbersUsingBooleanArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5};
        int n = 6;

        boolean present[] = new boolean[n + 1];

        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
