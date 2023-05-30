package Class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PersonTester {
    public static void main(String[] args) {
        Map<Integer,Person> personMap=new TreeMap<>();
        Person person1= new Person("Wael","Boles",45,2568463);
        Person person2= new Person("John","Smith",50,568614);
        Person person3= new Person("Tota","Wael",25,10256584);
        Person person4= new Person("Lolo","Boles",20,256586);
        personMap.put(1,person1);
        personMap.put(2,person2);
        personMap.put(3,person3);
        personMap.put(4,person4);

        for (Map.Entry<Integer, Person> p : personMap.entrySet()) {
            System.out.println(p);

        }




    }
}
