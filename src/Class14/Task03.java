package Class14;

public class Task03 {
    /*Write a method to return whether given number is prime or not?*/

    boolean isPrime(int num) {

        if (num == 2) {
            return true;
        } else if (num == 1) {
            return false;
        }
        {
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
        public static void main(String[] args) {
            Task03 adj= new Task03();
            int num=7;
            boolean result=adj.isPrime(num);
            System.out.println(result);

        }

    }


