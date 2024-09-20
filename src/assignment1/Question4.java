package assignment1;

public class Question4 {

    public static double derivative(){
        double der = 0;
        double h = 0.5;
        double x = 0.5;

        for(int n = 0; n < 30; n++) {

            der = Math.sin(x + h) - Math.sin(x);
            der = der / h;
            System.out.println(der);
            h = h * 0.5;
        }

        System.out.println("");

        h = 0.5;
        x = 0.5;

        for(int n = 0; n < 30; n++) {

            der = sineSubtraction(x, h);
            der = der / h;
            System.out.println(der);
            h = h * 0.5;
        }

        return der;
    }

    public static double sineSubtraction(double x, double h){

        double sum = 0;
        double term = 0;

        for(int i = 0; i < 40; i++){

            term = Math.pow(-1, i) * Math.pow((x+h), 2*i + 1) - Math.pow(-1, i) * Math.pow(x, 2*i + 1) ;
            term = term / fact(2*i + 1);
            sum = sum + term;


        }

        return sum;

    }

    public static double fact(int n){

        double total = 1;

        for(int i = 1; i <= n; i++){

            total = total * i;

        }

        //System.out.println("factorial " + n + ": " + total);
        return total;

    }

    public static double oneOverX(){

        double der = 0;
        double h = 0.5;
        double x = 0.5;

        for(int n = 0; n < 30; n++) {

            der = 1/(x + h) - 1/(x);
            der = der / h;
            System.out.println(der);
            h = h * 0.5;
        }

        return der;
    }

    public static double bigFunction(){
        double x = 0.5;

        for(int i = 1; i < 30; i++){

            System.out.println(calcFunc(x));
            x = x / 2;

        }


        return 3;

    }

    public static double calcFunc(double x){

        double term1 = calcFirstTerm(x);
        double term2;
        double numerator = 0;
        double denominator;
        double term;




        for(int i = 0; i < 30; i++){


            term = Math.pow(-1, i) * Math.pow(x, 2*i + 3) ; //starting at term x^3
            term = term / fact(2*i + 1);
            numerator = numerator + term;
        }

        denominator = (Math.pow(x, 3) / 3) + (2*Math.pow(x, 5) / 15) + (17*Math.pow(x, 7) / 315) + (62*Math.pow(x, 9) / 2835) + (1382*Math.pow(x, 11) / 155925);
        denominator = - denominator;

        term2 = numerator / denominator;

        //System.out.println(term1 + ", " + term2);

        return term1 - term2;

    }

    public static double calcFirstTerm(double x){

        double term = (0.5) + (-1* Math.pow(x, 2)/8) + ( Math.pow(x, 4)/16) + (-5* Math.pow(x, 6)/128) + (7* Math.pow(x, 8)/256) + (-21* Math.pow(x, 10)/1024);


        return term;
    }

}
