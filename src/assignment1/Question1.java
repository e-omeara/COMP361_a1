package assignment1;

public class Question1 {

    public static float singlePrecisions(int n){

        float miao = 0;
        int max = (int)Math.pow(10, n);

        for(int k = 1; k <= max; k++){
            miao = miao + 1/(float)k;

        }



        return miao;

    }

    public static double doublePrecisions(int n){

        double miao = 0;
        int max = (int)Math.pow(10, n);

        for(int k = 1; k <= max; k++){
            miao = miao + 1/(double)k;

        }



        return miao;
    }
}
