package assignment1;

public class Question3 {

    public static final double accurate = 2.0 / 3.141592653589793;

    public static double midPoint(int m){

        // getting the summation
        double sum = 0;
        double h = 1/(double)m;
        double cons = h / 2;

        for(int i = 0; i < m; i++){
            sum = sum + function(i*h + cons);
        }

        double result = h * sum;
        errorCalc(result, h);

        return h * sum;


    }

    public static double simpsons(int m){

        double h = 1/(double)m;
        double sum = function(0);

        for(int i = 1; i < m; i++){

            sum = sum + 2* (1+ i % 2) * function(i*h);
        }

        double result = sum * h / 3;
        errorCalc(result, h);

        return sum * h / 3;
    }

    public static double function(double x){

        final double pi = 3.141592653589793;
        double result = Math.sin(pi * x);


        return result;
    }

    public static String errorCalc(double result, double h){

        String errors = "";

        double error  = Math.abs(result - accurate);
        for(int p = 1; p <10; p++){
            errors = errors + (Math.pow(h, p) / error) + ", ";
        }




        return errors;
    }
}
