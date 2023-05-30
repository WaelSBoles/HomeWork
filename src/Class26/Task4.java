package Class26;
/*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> duplicate=new ArrayList<>();
        duplicate.add(10);
        duplicate.add(15);
        duplicate.add(10);
        duplicate.add(15);
        System.out.println(duplicate);
        int sum=0;
        for (Integer integer : duplicate) {
            sum+=integer;


        }
        System.out.println(sum);
    }
}
