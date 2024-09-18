package assignment1;

public class COMP361_a1 {

    public static void main(String[] args) {

        //doFirst();
        doSecond();

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

}
