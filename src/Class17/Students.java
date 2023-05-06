package Class17;

public class Students {
    /*
 Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your
 class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
  Your program should print an average mark of each students name.
  */
    String studentName;
    int subject1;
    int subject2;
    int subject3;

    public Students(String studentName, int subject1, int subject2, int subject3) {
        this.studentName = studentName;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    int avarageGrade(){
        return(subject1+subject2+subject3)/3;
    }
    void printInf(){
        System.out.println(studentName+" "+subject1+" "+subject2+" "+subject3+" "+avarageGrade());
    }

    public static void main(String[] args) {
        Students student=new Students("John",98,85,90);
        Students student2=new Students("Tom",80,75,50);
        Students student3=new Students("Celina",98,95,99);
        Students student4=new Students("Adam",90,70,90);
        Students student5=new Students("Natalie",98,94,98);
        student.printInf();
        student2.printInf();
        student3.printInf();
        student4.printInf();
        student5.printInf();
    }
}
