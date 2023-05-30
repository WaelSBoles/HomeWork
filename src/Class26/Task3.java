package Class26;
/*3) Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/


import java.util.Collection;
import java.util.LinkedHashSet;


public class Task3 {
    public static void main(String[] args) {
       Collection<String> names=new LinkedHashSet<>();
       names.add("Egypt");
       names.add("USA");
       names.add("Canada");
       names.add("Italy");
        for (String name : names) {
            System.out.print(name+" ");

        }
    }

}
