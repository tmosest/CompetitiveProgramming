package com.tmosest.numberwang.graph;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FunctionGrapher extends JFrame {

    public FunctionGrapher(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(createChartPanel());
        pack();
        setLocationRelativeTo(null);
    }

    private ChartPanel createChartPanel() {
        XYSeries series = new XYSeries("y = x^2");
        int numPoints = 100;
        for (int i = 0; i < numPoints; i++) {
            double x = -5 + (10.0 * i / numPoints);
            series.add(x, myFunction(x));
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Function Graph", "x", "y", dataset,
                PlotOrientation.VERTICAL, true, true, false);

        return new ChartPanel(chart);
    }
    
    public double myFunction(double x) {
        // return Math.pow(x, 2);
        return x;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FunctionGrapher example = new FunctionGrapher("Function Graph Example");
            example.setVisible(true);
        });
    }
}