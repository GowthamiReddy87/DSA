import java.util.HashSet;

public class MissingNumbersUsingHashSet {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5};
        int n = 6;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}