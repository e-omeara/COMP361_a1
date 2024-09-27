package assignment1;

public class Question1 {

    public static float singlePrecisions(int n){

        float miao = 1;     //total sum of harmonic
        int max = (int)Math.pow(10, n);

        for(int k = 1; k <= max; k++){
            //System.out.println(1/(float)k);
            miao = miao + 1/(float)k;

        }
        //System.out.println(10 + 1/(float)(max-1));


        return miao;

    }

    public static double doublePrecisions(int n){

        double miao = 1;        //total sum of harmonic
        int max = (int)Math.pow(10, n);

        for(int k = 1; k <= max; k++){
            miao = miao + 1/(double)k;

        }
        //System.out.println(1 + 1/(double)(max-1));



        return miao;
    }

    public static float singleCubic(int n){

        float miao = 1;     //total sum of cubic
        int max = (int)Math.pow(10, n);

        for(int k = 1; k <= max; k++){
            //System.out.println(1/(float)k);
            miao = miao + 1/(float)Math.pow(3, k);

        }
        //System.out.println(10 + 1/(float)(max-1));


        return miao;

    }

    public static double doubleCubic(int n){

        double miao = 1;        //total sum of harmonic
        int max = (int)Math.pow(10, n);

        for(int k = 1; k <= max; k++){
            miao = miao + 1/Math.pow(3, k);

        }
        //System.out.println(1 + 1/(double)(max-1));



        return miao;
    }

}
