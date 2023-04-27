package Class13;

public class Task02 {
    //How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("This is sentence i want to reverse");
        str=str.reverse();
        System.out.println(str);
    }
}
