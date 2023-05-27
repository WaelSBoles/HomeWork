package Project2;

import java.util.Arrays;


//Check if Two Strings are Anagrams: Given two strings, determine if
//they are anagrams, meaning they contain the same characters in a
//different order. For example, "listen" and "silent" are anagrams.

import java.util.Arrays;

    public class Task4 {
        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            boolean isAnagram = checkAnagram(str1, str2);

            if (isAnagram) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

        public static boolean checkAnagram(String str1, String str2) {

            if (str1.length() != str2.length()) {
                return false;
            }

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();


            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }
    }

