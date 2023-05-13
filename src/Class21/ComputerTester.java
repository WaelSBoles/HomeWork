package Class21;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] arr={new Apple("Apple","silver",22),
        new Lenovo("Lenovo","Black",21),
        new HP("HP","White",20),
        new Dell("Dell","Red",20)};
        for (Computer computer : arr) {
            computer.performance();
            computer.ram();

        }
        Computer del=new Dell("Dell","Red",202);
        ((Dell)del).looking();

        Dell c=(Dell) del;
        c.looking();

    }
}
