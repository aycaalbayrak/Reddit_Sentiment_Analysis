import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;

public class SentimentChart {
    public static void drawChart(int positive, int negative, int neutral) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Pozitif", positive);
        dataset.setValue("Negatif", negative);
        dataset.setValue("Nötr", neutral);

        JFreeChart chart = ChartFactory.createPieChart(
                "Reddit Sentiment Analizi",
                dataset,
                true,
                true,
                false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionPaint("Pozitif", new java.awt.Color(0, 200, 0));
        plot.setSectionPaint("Negatif", new java.awt.Color(200, 0, 0));
        plot.setSectionPaint("Nötr", new java.awt.Color(200, 200, 0));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(new ChartPanel(chart));
        frame.setVisible(true);
    }
}

