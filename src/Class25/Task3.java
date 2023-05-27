package Class25;

import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        HashSet <Student> students=new HashSet<>();
        Student student=new Student("Wael","1234");
        Student student2=new Student("Tota","25336");
        Student student3=new Student("Wael","3594");
        students.add(student);
        students.add(student2);
        students.add(student3);
        for(Student s:students){
            System.out.println(s);
        }

    }
}
class Student{
    String name;
    String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}