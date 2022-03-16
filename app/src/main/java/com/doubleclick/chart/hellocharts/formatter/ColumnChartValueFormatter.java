package com.doubleclick.chart.hellocharts.formatter;


import com.doubleclick.chart.hellocharts.model.SubcolumnValue;

public interface ColumnChartValueFormatter {

    public int formatChartValue(char[] formattedValue, SubcolumnValue value);

}
