package assignment1;

public class COMP361_a1 {

    public static void main(String[] args) {

        //doFirst();
        //doSecond();
        //doThird();
        doFourth();

    }

    public static void doFirst(){

        for(int i = 1; i <= 8; i++){
            System.out.println("Single precision sum to 10^" + i + ": " + Question1.singlePrecisions(i));
        }

        for(int i = 1; i <= 8; i++){
            System.out.println("Double precision sum to 10^" + i + ": " + Question1.doublePrecisions(i));
        }

        for(int i = 1; i <= 8; i++){
            System.out.println("Single precision cubic sum to 10^" + i + ": " + Question1.singleCubic(i));
        }

        for(int i = 1; i <= 8; i++){
            System.out.println("Double precision cubic sum to 10^" + i + ": " + Question1.doubleCubic(i));
        }

        //System.out.println(1 + 1/(Math.pow(10, 15)-1));


    }


    public static void doSecond(){

        Question2.method(1, 20);

        Question2.method2(0.1, 20, 1.5);
;
    }

    public static void doThird(){


        for(int m = 2; m <= 40; m = m+4) {

            double midpoint = Question3.midPoint(m);
            double simpson = Question3.simpsons(m);
            System.out.println("Midpoint approximation for m = " + m + ": " + midpoint);
            System.out.println("error is: " + Math.abs(midpoint - Question3.accurate));
            //System.out.println(Question3.errorCalc(midpoint, 1/(double)m));
            System.out.println("Simpson approximation for m = " + m + ": " + simpson);
            System.out.println("error is: " + Math.abs(simpson - Question3.accurate));
            System.out.println(Question3.errorCalc(simpson, 1/(double)m));
            System.out.println("");
        }
    }

    public static void doFourth(){

        //Question4.derivative();

        //Question4.oneOverX();
        Question4.bigFunction();


    }

}
