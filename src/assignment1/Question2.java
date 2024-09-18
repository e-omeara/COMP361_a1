package assignment1;

public class Question2 {

    public static double method(double initial, int max){
        //first operation
        return method(initial, max, 0);





    }


    public static double method(double previous, int max, int count){

        double value;

        if(count < max){
            count++;
            value = operation(method(previous, max, count));


        } else{
            value = operation(previous);
        }

        return value;

    }

    public static double method2(double initial, int max, double c){
        //first operation
        return method2(initial, max, c, 0);





    }

    public static double method2(double previous, int max, double c, int count){

        double value;

        if(count < max){
            count++;
            value = operation2(method2(previous, max, c, count), c);


        } else{
            value = operation2(previous, c);
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
