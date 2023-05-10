package Class19;


    /*Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
    public class Task3 {
        static void multiply(int a,int b){
            System.out.println(a*b);
        }
        static void multiply(int num1,double num2) {
            System.out.println(num1* num1);

        }
        static void multiply(double num1,double num2) {
            System.out.println(num1*num1);
        }

        public static void main(String[] args) {
            multiply(10,5);
            multiply(15,10.5);
            multiply(3.5,14.5);
        }
    }


