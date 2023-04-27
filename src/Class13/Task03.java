package Class13;

public class Task03 {    public static void main(String[] args) {
    //How would you check if String is palindrome or not? aba=> true
    //Abbc =>false
    String str = "aba";
    boolean isPalindrome = true;

    for (int i = 0; i < str.length() / 2; i++) {
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println(str + " is a palindrome");
    } else {
        System.out.println(str + " is not a palindrome");
    }
}
}

