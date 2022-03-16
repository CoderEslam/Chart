package com.doubleclick.chart.hellocharts.formatter;


import com.doubleclick.chart.hellocharts.model.SliceValue;

public interface PieChartValueFormatter {

    public int formatChartValue(char[] formattedValue, SliceValue value);
}
