package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        Car car=new Car("Car Insurance","Toyota");
        Pet pet=new Pet("Dog Insurance","German");
        Heath heath=new Heath("Health Insurance");
        insurances.add(car);
        insurances.add(pet);
        insurances.add(heath);
        for(Insurance in:insurances){
            System.out.println(in);
        }
        System.out.println("*************************");
        for (int i = 0; i <insurances.size() ; i++) {
            System.out.println(insurances.get(i));

        }
        System.out.println("*****************");
        Iterator<Insurance> iterator=insurances.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

