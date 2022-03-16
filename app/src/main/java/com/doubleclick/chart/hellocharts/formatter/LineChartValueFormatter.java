package com.doubleclick.chart.hellocharts.formatter;


import com.doubleclick.chart.hellocharts.model.PointValue;

public interface LineChartValueFormatter {

    public int formatChartValue(char[] formattedValue, PointValue value);
}
