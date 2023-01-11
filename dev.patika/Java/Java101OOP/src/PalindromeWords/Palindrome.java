package PalindromeWords;

public class Palindrome {

    static boolean isPalindrome = true;

    static void isCheck(String word) {
        for (int i = 0, j = (word.length() - 1); i < word.length(); i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }

}
