package Class15;
public class SyntaxEmployee {
        /*Create a Class called SyntaxEmployee:
          Create three  variables  empID , salary and set the CEO to “Sumair”
         Create two objects of the class SyntaxEmployee
         Set the value of eID, salary for each of the objects
           Print out the eID , salary and  CEO for each of the objects*/
        String empId;
        double salary;
        static String CEO="Sumair";

        public static void main(String[] args) {
            Class15.SyntaxEmployee asghar=new Class15.SyntaxEmployee();
            asghar.empId="123456";
            asghar.salary=900000;
            System.out.println(asghar.CEO); // not the preferred way
            System.out.println(Class15.SyntaxEmployee.CEO);// 99.99 this is how they are used

            Class15.SyntaxEmployee sohail=new Class15.SyntaxEmployee();
            sohail.empId="584685";
            sohail.salary=92000;
            System.out.println(sohail.empId);
            System.out.println(asghar.empId);
        }
    }



