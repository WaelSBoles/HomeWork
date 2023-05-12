package Class20;

public class Degree {

    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
    class Bachelors extends Degree{


    }
    static class Masters extends Degree{


        @Override
        void getPrerequisite(){
            System.out.println("I got My Master degree");
        }
    }




}

