package Class19;

/*Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class Task4 {
    private void add(int a, int b){
        System.out.println(a+b);
    }
    private void add(int num1, double num2) {
        System.out.println(num1+ num1);

    }
    private void add(double num1, double num2) {
        System.out.println(num1+num1);
    }

    public static void main(String[] args) {
        Task4 obj=new Task4();
        obj.add(10,15);
        obj.add(10,5.6);
        obj.add(5.5,8.2);

    }
}