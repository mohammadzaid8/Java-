import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome using in-built function.");
        } else {
            System.out.println(str + " is not a palindrome using in-built function.");
        }
        int n = str.length();
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome using loop.");
        } else {
            System.out.println(str + " is not a palindrome using loop.");
        }
    }
}