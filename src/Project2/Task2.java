package Project2;


    /*Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome*/

    public class Task2 {
        boolean isPalindrome(String str) {

            String reversedStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversedStr = reversedStr + str.charAt(i);
            }
            boolean isStrPalindrome = false;
            if (str.equalsIgnoreCase(reversedStr)) {
                isStrPalindrome = true;
            }
            return isStrPalindrome;
        }

        boolean isPalindromeSB(String str) {

            return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
        }

        public static void main(String[] args) {
            Project2.Task2 task2 = new Project2.Task2();
            boolean result = task2.isPalindrome("madam");
            System.out.println(result);
        }
    }



