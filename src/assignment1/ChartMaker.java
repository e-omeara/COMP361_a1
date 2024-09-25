package assignment1;
//package org.knowm.xchart.standalone.readme;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

import java.io.IOException;

public class ChartMaker {

    public static void chartMake(double[] xData, double[] yData, String title, String xAx, String yAx, String label, String name) throws IOException {

        //double[] xData = new double[]{0.0, 1.0, 2.0};
        //double[] yData = new double[]{2.0, 1.0, 0.0};

// Create Chart
        XYChart chart = QuickChart.getChart(title, xAx, yAx, label, xData, yData);

// Show it
        //new SwingWrapper(chart).displayChart();

// Save it
        //BitmapEncoder.saveBitmap(chart, "./Sample_Chart", BitmapEncoder.BitmapFormat.PNG);

// or save it in high-res
        BitmapEncoder.saveBitmapWithDPI(chart, "./" + name, BitmapEncoder.BitmapFormat.PNG, 300);

    }

}
