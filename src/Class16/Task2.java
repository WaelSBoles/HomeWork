package Class16;

public class Task2 {
    private String vowels(String str) {
        StringBuilder vowels = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels.append(c);
            }
        }

        return vowels.toString();
    }

    public static void main(String[] args) {
        Task2 extractor = new Task2();
        String input = "This is a sample string";
        String vowelsOnly = extractor.vowels(input);
        System.out.println(vowelsOnly);
    }

}
