package Project2;
    //Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2.
    public class Task3 {
        public static void main(String[] args) {
            String input = "Hello, world!";
            int wordCount = countWords(input);
            System.out.println("Word count: " + wordCount);
        }
        public static int countWords(String input) {
            input = input.trim();
            if (input.isEmpty()) {
                return 0;
            }
            String[] words = input.split("\\s+");

            return words.length;
        }
    }


