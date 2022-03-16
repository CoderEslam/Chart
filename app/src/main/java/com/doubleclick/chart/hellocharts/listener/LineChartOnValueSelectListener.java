package com.doubleclick.chart.hellocharts.listener;


import com.doubleclick.chart.hellocharts.model.PointValue;

public interface LineChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int lineIndex, int pointIndex, PointValue value);

}
