package Class12;

import java.util.Scanner;

public class Task03 {
    /* Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what's Mom first name?");
        String momName=scan.next();
        System.out.println("what's Dad's first name");
        String dadName=scan.next();
        System.out.println("what's you expectation about the baby's gender");
        String gender=scan.next();
        if (gender.equals("boy")){
            System.out.println("suggested name is Danary");
        }else{
            System.out.println("suggested name is Maiel");
        }
    }


}


