package com.doubleclick.chart.hellocharts.provider;


import com.doubleclick.chart.hellocharts.model.LineChartData;

public interface LineChartDataProvider {

    public LineChartData getLineChartData();

    public void setLineChartData(LineChartData data);

}
