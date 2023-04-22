package Class12;

public class Task02 {
    /* Create a String and if the String is not empty perform the following:
     if the String has an odd number of characters and has 3 or more characters,
           print the character in the middle of the String.For Example String str=hello =>l
     */
    public static void main(String[] args) {
         String sentence = "I love Java";
         if (!sentence.isEmpty()&& sentence.length()%2!=0&& sentence.length()>=3);{
            System.out.println(sentence.charAt(5));
        }
    }

}
