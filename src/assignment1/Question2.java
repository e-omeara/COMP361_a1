package assignment1;

import java.io.IOException;

public class Question2 {

    static double[] xVal;
    static double[] yVal;

    static double[] xVal1;
    static double[] yVal1;

    public static double methodCall(double initial, int max) throws IOException {
        //first operation

        xVal = new double[max];
        yVal = new double[max];


        double value = method(initial, max-1, 0);

        ChartMaker.chartMake(xVal, yVal, "Series for f(x) = (2x^3+5)/3x^2", "Repetitions", "f(x)", "(2x^3+5)/3x^2", "q2/part1" );

        return value;





    }


    public static double method(double previous, int max, int count) throws IOException {

        double value;

        if(count < max){
            count++;
            value = operation(method(previous, max, count));
            xVal[max - count + 1] = max - count + 2;
            yVal[max - count + 1] = value;
            //System.out.println(xVal[max - count + 1] + ": " + value);


        } else{
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
        //first operation

        xVal1 = new double[max];
        yVal1 = new double[max];

        double value = method2(initial, max-1, c, 0);

        ChartMaker.chartMake(xVal1, yVal1, "Series for f(x) = cx(1-x), c = " + c, "Repetitions", "f(x)", "cx(1-x)", "q2/part2c" + c );


        return value;





    }

    public static double method2(double previous, int max, double c, int count) throws IOException {

        double value;

        if(count < max){
            count++;
            value = operation2(method2(previous, max, c, count), c);
            xVal1[max - count + 1] = max - count + 2;
            yVal1[max - count + 1] = value;
            //System.out.println(xVal1[max - count + 1] + ": " + value);


        } else{
            count++;
            value = operation2(previous, c);
            xVal1[max - count + 1] = max - count + 2;
            yVal1[max - count + 1] = value;
            //System.out.println(xVal1[max - count + 1] + ": " + value);

        }



        return value;

    }

    public static double operation(double previous){

        double output = 2* Math.pow(previous, 3) + 5;
        output = output / (3* Math.pow(previous,2));

        System.out.println(output);

        return output;

    }

    public static double operation2(double x, double c){

        double output = c* x * (1-x);


        System.out.println(output);

        return output;

    }

}
