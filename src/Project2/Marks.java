package Project2;
/*7. We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code*/


    public abstract class Marks {

        int[] marks;

        public Marks(int[] marks) {
            this.marks = marks;
        }
        abstract double getPercentage();
    }
    class A extends Project2.Marks {
        public A(int[] marks) {
            super(marks);
        }

        @Override
        double getPercentage() {
            int sum=0;
            for (int mark:marks) {
                sum+=mark;
            }
            return sum/3.0;
        }
    }
    class B extends Project2.Marks {
        public B(int[] marks) {
            super(marks);
        }

        @Override
        double getPercentage() {
            int sum=0;
            for (int mark:marks) {
                sum+=mark;
            }
            return sum/4.0;
        }

        public static void main(String[] args) {

            int[] marksA={95,92,90};
            A a=new A(marksA);
            System.out.println(a.getPercentage());

            int[] marksB= new int[]{85, 88, 92, 90};
            B b=new B(marksB);
            System.out.println(b.getPercentage());
        }
    }


