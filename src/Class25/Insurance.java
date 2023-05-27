package Class25;
/*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel
and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
 Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Insurance {
        String insuranceName;

        public Insurance(String insuranceName) {
            this.insuranceName = insuranceName;
        }

        abstract void getQuote();
        abstract void cancelInsurance();

    }
    class Car extends Class25.Insurance {
        String carModel;

        public Car( String insuranceName,String carModel) {
            super( insuranceName);
            this.carModel = carModel;
        }

        @Override
        void getQuote() {
            System.out.println("you got it");

        }

        @Override
        void cancelInsurance() {
            System.out.println("you've already paid so you can;t cancel");

        }

        @Override
        public String toString() {
            return "Car{" +
                    "carModel='" + carModel + '\'' +
                    ", insuranceName='" + insuranceName + '\'' +
                    '}';
        }
    }
    class Pet extends Class25.Insurance {
        String petType;

        public Pet(String insuranceName,String petType) {
            super(insuranceName);
            this.petType = petType;
        }

        @Override
        void getQuote() {
            System.out.println(" it's so Cheap");

        }

        @Override
        void cancelInsurance() {
            System.out.println("Sorry we cant't");

        }

        @Override
        public String toString() {
            return "Pet{" +
                    "petType='" + petType + '\'' +
                    ", insuranceName='" + insuranceName + '\'' +
                    '}';
        }
    }
    class Heath extends Class25.Insurance {

        public Heath(String insuranceName) {
            super(insuranceName);
        }

        @Override
        void getQuote() {
            System.out.println("we have the best Quote");
        }

        @Override
        void cancelInsurance() {
            System.out.println("It's too Lateeee");

        }

        @Override
        public String toString() {
            return "Heath{" +
                    "insuranceName='" + insuranceName + '\'' +
                    '}';
        }
    }
