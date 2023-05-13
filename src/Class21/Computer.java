package Class21;

public class Computer {
    /* Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
     Define common behavior within and some fields in parent class and override some of the methods in child classes
             Define some methods specific to child classes
             Create objects of child classes and store them into array. Loop through each object and execute available methods.*/
    String name;
    String color;
    int speed;

    Computer(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;

    }

    void performance() {
        System.out.println("It's performing very well");
    }

    void ram() {
        System.out.println("it has high speed Rams");
    }
}
    class Apple extends Computer{

        Apple(String name, String color, int speed) {
            super(name, color, speed);
        }
        @Override
        void performance(){
            System.out.println("Apply has high performance");
        }
        @Override
        void ram(){
            System.out.println("Very fast Rams for Apple");
        }
    }

    class Lenovo extends Computer{
        Lenovo(String name,String color,int speed){
            super(name,color,speed);
        }
        @Override
        void performance(){
            System.out.println("Lenovo has high performance");
        }
        @Override
        void ram(){
            System.out.println("Rams are very fast for Lenovo");
        }

    }
    class HP extends Computer{
        HP(String name,String color, int speed){
            super(name,color,speed);
        }
        @Override
        void performance(){
            System.out.println("HP performing Highly");
        }
        @Override
        void ram(){
            System.out.println("HP has high speed Ram");
        }


    }
    class Dell extends Computer{

        Dell(String name, String color, int speed) {
            super(name, color, speed);
        }
        @Override
        void performance(){
            System.out.println("Dell performs very well");
        }
        @Override
        void ram(){
            System.out.println("Rams in Dell are Awesome");
        }
        void looking(){
            System.out.println("It's very sleek");
        }

    }

