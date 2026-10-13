
public class MissingNumbersWithDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5};
        int n = 6;

        for (int num = 1; num <= n; num++) {
            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(num + " ");
            }
        }
    }
}
