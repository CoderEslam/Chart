package com.doubleclick.chart.hellocharts.listener;


import com.doubleclick.chart.hellocharts.model.BubbleValue;

public interface BubbleChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int bubbleIndex, BubbleValue value);

}
