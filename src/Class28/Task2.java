package Class28;
/*Create a method checkUserName that will throw a runtime exception.
Method should throw an exception when entered username is less than 5 characters.
 */

public class Task2 {
    public static void checkUserName(String userName){
        if(userName.length()<5){
            throw new RuntimeException("Username must have at least 5 characters.");
        }
    }
}
