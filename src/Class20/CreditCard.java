package Class20;
/*Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.*/

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void calculate(double balance, double interest) {
        System.out.println(balance * interest);
    }
}
 class Visa extends CreditCard{

    public Visa(double balance, double interest) {
        super(balance, interest);
    }




}
class AX extends CreditCard{

    public AX(double balance, double interest) {
        super(balance, interest);
    }
    @Override
    void calculate(double balance,double interest) {
        System.out.println("the interest rate in 12 month = "+interest / balance);
    }
}

