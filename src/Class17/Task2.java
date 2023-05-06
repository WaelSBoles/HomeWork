package Class17;

public class Task2 {
        /*Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class:
     1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
     */

    String name;
    String s;
    int age;
    int a;
    private Task2(){
        System.out.println("This is Private");

    }
    public Task2(String s){
        name=s;
        System.out.println("This is Public");

    }
    Task2(int age){
        a=age;
        System.out.println("This is default");

    }
    protected Task2(String name, int a){
        name=name;
        age=a;
        System.out.println("This is protected");
    }



    public static void main(String[] args) {
        Task2 obj=new Task2();
        Task2 obj1=new Task2("White");
        Task2 obj2=new Task2(135);
        Task2 obj3=new Task2("Tom",45);

    }
}



