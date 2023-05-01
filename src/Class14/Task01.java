package Class14;

public class Task01 {
    /*Create a method that will say Hello
  in different language based on the country that will passed when method is executed.
   */
    //
    void sayHello(String countryCode) {
     /*Create a method that will say Hello in different language based on the country
     that will passed when method is executed.
      */

        switch (countryCode) {
            case "US":
                System.out.println("Hello!");
                break;
            case "France":
                System.out.println("Bonjour!");
                break;
            case "Spain":
                System.out.println("¡Hola!");
                break;
            case "Egypt":
                System.out.println("Salam!");
                break;
            default:
                System.out.println("Sorry, I don't know how to greet people from " + countryCode + ".");
                break;
        }

    }

    public static void main(String[] args) {
        Task01 obj = new Task01();
        obj.sayHello("Egypt");


    }
}

