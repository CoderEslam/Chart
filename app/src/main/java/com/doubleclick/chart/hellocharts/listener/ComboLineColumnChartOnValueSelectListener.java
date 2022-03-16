package com.doubleclick.chart.hellocharts.listener;


import com.doubleclick.chart.hellocharts.model.PointValue;
import com.doubleclick.chart.hellocharts.model.SubcolumnValue;

public interface ComboLineColumnChartOnValueSelectListener extends OnValueDeselectListener {

    public void onColumnValueSelected(int columnIndex, int subcolumnIndex, SubcolumnValue value);

    public void onPointValueSelected(int lineIndex, int pointIndex, PointValue value);

}
