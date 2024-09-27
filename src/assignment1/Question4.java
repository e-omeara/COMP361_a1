package assignment1;

import java.io.IOException;

public class Question4 {

    public static double derivative() throws IOException {
        double der = 0;
        double h = 0.5;
        double x = 0.5;
        double[] sinDeriv = new double[30];
        double[] sinErr = new double[30];
        double xVal[] = new double[30];


        //below, I tried using the sin subtraction, but found that it wasn't precise enough and led to zero
        /*
        for(int n = 0; n < 30; n++) {

            der = Math.sin(x + h) - Math.sin(x);
            der = der / h;
            System.out.println(der);
            h = h * 0.5;
        }

        System.out.println("");
        */


        h = 0.5;
        x = 0.5;

        //performing the derivative calculation for increasingly small values of h
        for(int n = 0; n < 30; n++) {

            xVal[n] = - Math.log10(h);
            der = sineSubtraction(x, h);        //calling the function to perform the math
            der = der / h;
            sinDeriv[n] = der;
            sinErr[n] = Math.log10( Math.abs(der - 0.8775825618903));       //calculating the error
            //System.out.println(der);
            h = h * 0.5;
        }

        //making the txt files and chart
        CSVoutputer.dataToCSV(xVal, sinDeriv, "-log10(h)", "d/dx sinx", "q4/sinderiv");
        CSVoutputer.dataToCSV(xVal, sinErr, "-log10(h)", "d/dx sinx", "q4/sinDerivErr");
        ChartMaker.chartMake(xVal, sinErr, "Log of Error of derivative of sinx versus -log10(h)", "-log10(h)", "Error (log)", "error", "q4/sinErr");
        ChartMaker.chartMake(xVal, sinDeriv, "Derivative of sin(x) against -log10(h)", "-log10(h)", "derivative", "d/dx sin(x)", "q4/sine");

        return der;
    }

    public static double sineSubtraction(double x, double h){

        double sum = 0;
        double term = 0;

        //creating the taylor series terms for sin(x+h)-sin(x)
        for(int i = 0; i < 40; i++){

            term = Math.pow(-1, i) * Math.pow((x+h), 2*i + 1) - Math.pow(-1, i) * Math.pow(x, 2*i + 1) ;
            term = term / fact(2*i + 1);
            sum = sum + term;


        }

        return sum;

    }

    public static double fact(int n){
        //function to calculate a factorial
        double total = 1;

        for(int i = 1; i <= n; i++){

            total = total * i;

        }

        //System.out.println("factorial " + n + ": " + total);
        return total;

    }

    public static double oneOverX() throws IOException {

        //calculating the derivative of 1/x at x = 0.5
        //declaring variables
        double der = 0;
        double h = 0.5;
        double x = 0.5;
        double[] oneOverDeriv = new double[30];
        double[] overErr = new double[30];
        double xVal[] = new double[30];

        // performing the calculation for increasingly small values of h
        for(int n = 0; n < 30; n++) {

            xVal[n] = - Math.log10(h);
            der = 1/(x + h) - 1/(x);
            der = der / h;
            oneOverDeriv[n] = der;
            //overErr[n] = - Math.log( Math.abs(der - -4.0));
            overErr[n] = Math.abs(der - -4.0);
            System.out.println(der);
            h = h * 0.5;
        }

        //making the charts and text files
        CSVoutputer.dataToCSV(xVal, oneOverDeriv, "-log10(h)", "d/dx 1/x", "q4/oneOverDeriv");
        CSVoutputer.dataToCSV(xVal, overErr, "-log10(h)", "d/dx 1/x", "q4/oneOverDerivErr");
        ChartMaker.chartMake(xVal, overErr, "Error of derivative of 1/x versus -log10(h)", "-log10(h)", "Error", "error", "q4/oneOverErr");
        ChartMaker.chartMake(xVal, oneOverDeriv, "Derivative of 1/x versus -log10(h)", "-log10(h)", "derivative", "d/dx 1/x", "q4/oneOver");


        return der;
    }

    public static void bigFunction() throws IOException {

        //function to calculate the limit as x -> 0 of f(x)
        //declaring variables
        double x = 0.5;
        double[] bigVal = new double[30];
        double[] bigErr = new double[30];
        double[] xVal = new double[30];


        for(int i = 1; i <= 30; i++){

            // Calculate the value with increasingly small values of x
            xVal[i-1] = - Math.log10(x);
            bigVal[i-1] = calcFunc(x);
            bigErr[i-1] = Math.abs(bigVal[i-1] - 3.5);
            x = x / 2;

        }

        //put the results into charts and text files
        CSVoutputer.dataToCSV(xVal, bigVal, "-log10(x)", "limit f(x)", "q4/bigLimit");
        CSVoutputer.dataToCSV(xVal, bigErr, "-log10(x)", "error f(x)", "q4/bigLimitErr");
        ChartMaker.chartMake(xVal, bigErr, "Error of limit x->0 of f(x) versus -log10(x)", "-log10(x)", "Error", "error", "q4/bigErr");
        ChartMaker.chartMake(xVal, bigVal, "limit x->0 of f(x) versus -log10(x)", "-log10(x)", "limit", "limit f(x)", "q4/bigLim");



        return;

    }

    public static double calcFunc(double x){

        //method to calculate the function to a high degree of precision
        //declaring variables
        double term1 = calcFirstTerm(x);
        double term2;
        double numerator = 0;
        double denominator;
        double term;




        for(int i = 0; i < 30; i++){

            //Taylor approximation of x^2 *sinx

            term = Math.pow(-1, i) * Math.pow(x, 2*i + 3) ; //starting at term x^3
            term = term / fact(2*i + 1);
            numerator = numerator + term;
        }

        //Taylor approximation of x - tanx
        denominator = (Math.pow(x, 3) / 3) + (2*Math.pow(x, 5) / 15) + (17*Math.pow(x, 7) / 315) + (62*Math.pow(x, 9) / 2835) + (1382*Math.pow(x, 11) / 155925);
        denominator = - denominator;

        //performing the devision between the numerator and denominator
        term2 = numerator / denominator;

        //System.out.println(term1 + ", " + term2);

        //subtracting the two terms
        return term1 - term2;

    }

    public static double calcFirstTerm(double x){


        //Simplified Taylors expression of first term
        double term = (0.5) + (-1* Math.pow(x, 2)/8) + ( Math.pow(x, 4)/16) + (-5* Math.pow(x, 6)/128) + (7* Math.pow(x, 8)/256) + (-21* Math.pow(x, 10)/1024);


        return term;
    }

}
