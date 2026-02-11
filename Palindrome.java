public class Palindrome {
    public static void palindrome(String s) {

        String result = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }

        if(result.equals(s)) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
        String s = "mom";
        palindrome(s);
    }
}
