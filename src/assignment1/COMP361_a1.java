package assignment1;

import java.io.IOException;

public class COMP361_a1 {

    public static void main(String[] args) throws IOException {

        //doFirst();
        //doSecond();
        //doThird();
        doFourth();


    }

    public static void doFirst() throws IOException {

        int n = 9;
        double[] xVal = new double[n];
        double[] yVal = new double[n];



        for(int i = 1; i <= n; i++){
            //System.out.println("Single precision sum to 10^" + i + ": " + Question1.singlePrecisions(i));
            xVal[i-1] = i;
            yVal[i-1] = Question1.singlePrecisions(i);
            ChartMaker.chartMake(xVal, yVal, "Single precision harmonic sum to 10^" + n, "10^n", "Sum", "1/x", "q1/singleharmonic" );
        }

        for(int i = 1; i <= n; i++){
            //System.out.println("Double precision sum to 10^" + i + ": " + Question1.doublePrecisions(i));
            yVal[i-1] = Question1.doublePrecisions(i);
            ChartMaker.chartMake(xVal, yVal, "Double precision harmonic sum to 10^" + n, "10^n", "Sum", "1/x", "q1/doubleharmonic" );

        }

        for(int i = 1; i <= n; i++){
            //System.out.println("Single precision cubic sum to 10^" + i + ": " + Question1.singleCubic(i));
            yVal[i-1] = Question1.singleCubic(i);
            ChartMaker.chartMake(xVal, yVal, "Single precision cubic sum to 10^" + n, "10^n", "Sum", "1/x^3", "q1/singlecubic" );

        }

        for(int i = 1; i <= n; i++){
            //System.out.println("Double precision cubic sum to 10^" + i + ": " + Question1.doubleCubic(i));
            yVal[i-1] = Question1.doubleCubic(i);
            ChartMaker.chartMake(xVal, yVal, "Double precision cubic sum to 10^" + n, "10^n", "Sum", "1/x^3", "q1/doublecubic" );

        }

        //System.out.println(1 + 1/(Math.pow(10, 15)-1));


    }


    public static void doSecond() throws IOException {

        //Question2.methodCall(1, 20);

        Question2.methodCall2(0.1, 20, 3.98);
;
    }

    public static void doThird() throws IOException {

        int max = 60;
        double[] xVal = new double[max/4];
        double[] syVal = new double[max/4];
        double[] myVal = new double[max/4];
        double[] serrorVal = new double[max/4];
        double[] merrorVal = new double[max/4];


        for(int m = 2; m <= max; m = m+4) {

            xVal[((m-2)/4)] = m;
            double midpoint = Question3.midPoint(m);
            myVal[((m-2)/4)] = midpoint;
            merrorVal[((m-2)/4)] = Math.abs(midpoint - Question3.accurate);
            double simpson = Question3.simpsons(m);
            syVal[((m-2)/4)] = simpson;
            serrorVal[((m-2)/4)] = Math.abs(simpson - Question3.accurate);
            /*
            System.out.println("Midpoint approximation for m = " + m + ": " + midpoint);
            System.out.println("error is: " + Math.abs(midpoint - Question3.accurate));
            //System.out.println(Question3.errorCalc(midpoint, 1/(double)m));
            System.out.println("Simpson approximation for m = " + m + ": " + simpson);
            System.out.println("error is: " + Math.abs(simpson - Question3.accurate));
            System.out.println(Question3.errorCalc(simpson, 1/(double)m));
            System.out.println("");
            */



        }

        //ChartMaker.chartMake(xVal, myVal, "Midpoint approximation of integral of sin(pi x)", "M", "F(x)", "integral f(x)", "q3/midpoint");
        //ChartMaker.chartMake(xVal, syVal, "Simpson approximation of integral of sin(pi x)", "M", "F(x)", "integral f(x)", "q3/simpson");
        //ChartMaker.chartMake(xVal, merrorVal, "Error in Midpoint approximation of integral of sin(pi x)", "M", "Error", "error", "q3/midpointerr");
        //ChartMaker.chartMake(xVal, serrorVal, "Error in Simpson approximation of integral of sin(pi x)", "M", "Error", "error", "q3/simpsonerr");

        CSVoutputer.dataToCSV(xVal, myVal, "M", "F(x)", "q3/midpointData");
        CSVoutputer.dataToCSV(xVal, syVal, "M", "F(x)", "q3/simpsonData");
        CSVoutputer.dataToCSV(xVal, merrorVal, "M", "error", "q3/midpointError");
        CSVoutputer.dataToCSV(xVal, serrorVal, "M", "error", "q3/simpsonError");

    }

    public static void doFourth() throws IOException {

        //Question4.derivative();

        //Question4.oneOverX();
        Question4.bigFunction();


    }

}
