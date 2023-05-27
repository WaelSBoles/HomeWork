package Project2;

public class Task5 {
    public static void main(String[] args) {
        String input = "abracadabra";
        char Stnonrepeating = findNonRepeating(input);

        if (Stnonrepeating != '\0') {
            System.out.println("First non-repeating character: " + Stnonrepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
    public static char findNonRepeating(String input) {

        int[] charCount = new int[256];
        for (char c : input.toCharArray()) {
            charCount[c]++;
        }
        for (char c : input.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }
        return '\0';
    }
}

