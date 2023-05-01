package Class14;

public class Task02 {
       /*Create a method createEmail(). Based on values of users firstName, lastName and email type,
     your method should return complete email Address.
      Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

    String firstName;
    String lastName;
    String emailType;

    void ceateEmail(){
        System.out.println(firstName+lastName+emailType);
    }

    public static void main(String[] args) {
        Task02 obj=new Task02();
        obj.firstName="Wael";
        obj.lastName="boles";
        obj.emailType="@yahoo.com";
        obj.ceateEmail();

    }


}


