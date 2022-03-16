package com.doubleclick.chart.hellocharts.formatter;


import com.doubleclick.chart.hellocharts.model.BubbleValue;

public interface BubbleChartValueFormatter {

    public int formatChartValue(char[] formattedValue, BubbleValue value);
}
