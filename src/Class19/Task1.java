package Class19;


    /* Create 1 class in which create a methods that will calculate the area of Method name must be called calculateArea
Rectangle Square*/
    public class Task1 {
        static void calculateArea(int l,int w){
            System.out.println("Rectangular area = " + l*w);
        }
        static void calculateArea(int s1,double s2){
            System.out.println("Square Area = "+s1*s2);
        };

        public static void main(String[] args) {
            calculateArea(10,5);
            calculateArea(15,12.5);
        }


    }


