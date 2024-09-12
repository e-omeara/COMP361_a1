package assignment1;

public class COMP361_a1 {

    public static void main(String[] args) {

        for(int i = 1; i <= 8; i++){
            System.out.println("Single precision sum to 10^" + i + ": " + Question1.singlePrecisions(i));
        }

        for(int i = 1; i <= 8; i++){
            System.out.println("Double precision sum to 10^" + i + ": " + Question1.doublePrecisions(i));
        }



    }
}
