package Project2;

public class RegistrationTester {

        public static void main(String[] args) {


            Registration registration=new Registration();
            registration.setEmail("john@yahoo.com");
            registration.setUserName("johnsmith");
            registration.setPassword("password123");


            registration.setEmail("john@gmail.com");
            registration.setUserName("joh");
            registration.setPassword("password");

            registration.setPassword("johnsmithpassword");
        }
    }


