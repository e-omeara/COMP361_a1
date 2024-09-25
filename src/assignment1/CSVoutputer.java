package assignment1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVoutputer {

    public static void dataToCSV(double[] column1, double[] column2, String t1, String t2, String fileName){

        int num = column1.length;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt", false))){
            writer.write(t1 + "  " + t2);
            writer.newLine();
        } catch (IOException miao){
            miao.printStackTrace();
        }

        for(int i = 0; i < num; i++){

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt", true))){
                writer.write(column1[i] + "  " + column2[i]);
                writer.newLine();
            }
            catch(IOException ex){
                ex.printStackTrace();
            }

        }

    }
}
