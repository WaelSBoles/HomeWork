package Class18;

public class TeacherTester {
    public static void main(String[] args) {
        ChemistryTeacher chemistry=new ChemistryTeacher();
        chemistry.teach();
        chemistry.grade();
        chemistry.level();
        chemistry.title();
        MathTeacher math=new MathTeacher();
        math.title();
        math.teaching();
        math.grade();
        math.level();
        PianoTeacher piano=new PianoTeacher();
        piano.title();
        piano.piano();
        piano.grade();
        piano.level();
    }
}
