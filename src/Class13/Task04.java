package Class13;

public class Task04 {
    //How would you swap  2 strings without a temporary variable?
    public static void main(String[] args) {
        String str1 = "String one";
        String str2 = "String two";

        System.out.println("Before Swapping:");
        System.out.println("str1 is: "+str1);
        System.out.println("str2 is: "+str2);


        str1 = str1+str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After Swapping:");
        System.out.println("str1 is: "+str1);
        System.out.println("str2 is: "+str2);
    }
}

