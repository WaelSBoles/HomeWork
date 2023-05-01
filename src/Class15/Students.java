package Class15;


public class Students {
    /* Create a Class called Students
     Create three  variables  Name , ID  and  numberOfStudents
     Create three objects of the Students Class
     Set the value for  studentName , studentID and increment  the numberOfStudents for each object
     Print out  total number of students*/
    String name;
    String ID;
    static int numberOfStudent = 0;


    public static void main(String[] args) {
        Students obj = new Students();

        obj.name = "John";
        obj.ID = "1234";
        numberOfStudent++;
        Students obj1 = new Students();
        obj1.name = "Johan";
        obj1.ID = "12664";
        numberOfStudent++;

        Students obj2 = new Students();
        obj2.name = "Johan";
        obj2.ID = "12664";
        numberOfStudent++;

        System.out.println("Total numbers of students: " + numberOfStudent);
    }

}