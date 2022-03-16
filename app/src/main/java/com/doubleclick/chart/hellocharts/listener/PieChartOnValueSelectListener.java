package com.doubleclick.chart.hellocharts.listener;


import com.doubleclick.chart.hellocharts.model.SliceValue;

public interface PieChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int arcIndex, SliceValue value);

}
