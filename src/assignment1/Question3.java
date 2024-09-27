package assignment1;

public class Question3 {

    //storing the accurate value for 2/pi
    public static final double accurate = 2.0 / 3.141592653589793;

    public static double midPoint(int m){

        // getting the summation
        double sum = 0;
        double h = 1/(double)m;
        double cons = h / 2;

        //adding m midpoint terms
        for(int i = 0; i < m; i++){
            sum = sum + function(i*h + cons);
        }

        // multiplying by h and determining the error of the result
        double result = h * sum;
        errorCalc(result, h);
        //System.out.println(errorCalc(result, h));

        return result;


    }

    public static double simpsons(int m){

        //declaring variables
        double h = 1/(double)m;
        double sum = function(0);

        //adding the simpson terms together
        for(int i = 1; i < m; i++){

            sum = sum + 2* (1+ i % 2) * function(i*h);
        }

        //multiplying by h/3 and calculating the error for different powers of h
        double result = sum * h / 3;
        errorCalc(result, h);
        //System.out.println(errorCalc(result, h));

        return sum * h / 3;
    }

    public static double function(double x){

        //performing the mathematical operation for sin(pi*x)
        final double pi = 3.141592653589793;
        double result = Math.sin(pi * x);


        return result;
    }

    public static String errorCalc(double result, double h){

        String errors = "";
        //getting the error in ratio with different powers of h, to determine proportionality
        double error  = Math.abs(result - accurate);
        for(int p = 1; p <10; p++){
            errors = errors + (Math.pow(h, p) / error) + ", ";
        }




        return errors;
    }
}
