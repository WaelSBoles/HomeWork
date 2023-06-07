package Class28;
/* Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception age is less than 16.*/

public class Task1 {
    public  static void age(int age){
        if (age< 16){
            throw new RuntimeException("exception age is less than 16. not eligible.");
        }

    }
}
