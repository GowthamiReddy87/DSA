public class NumbersReturn {

    static String num(int n) {

        if(n == 0)
            return "";

        return n+" "+num(n-1);
    }

    public static void main(String[] args) {

        int n = 5;
        String result = num(n);

        System.out.println(result);
    }
}