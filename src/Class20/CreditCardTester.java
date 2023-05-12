package Class20;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard cc=new CreditCard(10,15);
          Visa v=new Visa(10,20);
         AX ax=new AX(18,30);
         cc.calculate(10,15/12);
         ax.calculate(18,30/12);



    }
}
