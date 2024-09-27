package assignment1;

import java.io.IOException;

public class Question2 {

    static double[] xVal;
    static double[] yVal;

    static double[] xVal1;
    static double[] yVal1;

    public static double methodCall(double initial, int max) throws IOException {
        //first call to method

        xVal = new double[max];     //storing the number of iterations
        yVal = new double[max];     //storing the values of f(x)

        //passing parameters to method
        double value = method(initial, max-1, 0);

        //making the chart and CSV
        ChartMaker.chartMake(xVal, yVal, "Series for f(x) = (2x^3+5)/3x^2, x0 = " + initial, "Repetitions", "f(x)", "(2x^3+5)/3x^2", "q2/part1x" + initial );
        CSVoutputer.dataToCSV(xVal, yVal, "iterations", "f(x)", "q2/part1x"+ initial);

        return value;





    }


    public static double method(double previous, int max, int count) throws IOException {

        double value;       //storing f(x)

        if(count < max){
            count++;
            value = operation(method(previous, max, count));        //performing the function upon the previous result
            xVal[max - count + 1] = max - count + 2;
            yVal[max - count + 1] = value;
            //System.out.println(xVal[max - count + 1] + ": " + value);


        } else{     //performing the final case
            count++;
            value = operation(previous);
            xVal[max - count + 1] = max - count + 2;
            yVal[max - count + 1] = value;
            //System.out.println(xVal[max - count + 1] + ": " + value);
            //ChartMaker.chartMake(xVal, yVal, "Series for f(x) = (2x^3+5)/3x^2", "Repetitions", "f(x)", "(2x^3+5)/3x^2", "q2/part1" );

        }



        return value;

    }

    public static double methodCall2(double initial, int max, double c) throws IOException {
        //first method call for second function

        xVal1 = new double[max];        //storing the interation numbers and values
        yVal1 = new double[max];

        //calling the recursive funnction
        double value = method2(initial, max-1, c, 0);

        //making the cahrt
        ChartMaker.chartMake(xVal1, yVal1, "Series for f(x) = cx(1-x), c = " + c, "Repetitions", "f(x)", "cx(1-x)", "q2/part2c" + c );


        return value;





    }

    public static double method2(double previous, int max, double c, int count) throws IOException {

        double value;       //value of the current iteration

        if(count < max){        //call the previous iteration
            count++;
            value = operation2(method2(previous, max, c, count), c);
            xVal1[max - count + 1] = max - count + 2;
            yVal1[max - count + 1] = value;
            //System.out.println(xVal1[max - count + 1] + ": " + value);


        } else{
            count++;
            value = operation2(previous, c);        //final case
            xVal1[max - count + 1] = max - count + 2;
            yVal1[max - count + 1] = value;
            //System.out.println(xVal1[max - count + 1] + ": " + value);

        }



        return value;

    }

    public static double operation(double previous){

        //performing the mathematical operation of the first function
        double output = 2* Math.pow(previous, 3) + 5;
        output = output / (3* Math.pow(previous,2));

        //System.out.println(output);

        return output;

    }

    public static double operation2(double x, double c){

        //performing the mathematical operation of the second function
        double output = c* x * (1-x);


        //System.out.println(output);

        return output;

    }

}
