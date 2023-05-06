package Class16;

public class Task1 {
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {

        String given="I want to reverse this Sentence";
        StringBuilder str = new StringBuilder(given);
        given=str.reverse().toString();
        System.out.println(given);


    }
}

