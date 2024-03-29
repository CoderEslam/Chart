package com.doubleclick.chart.hellocharts.renderer;


import android.content.Context;
import com.doubleclick.chart.hellocharts.provider.ColumnChartDataProvider;
import com.doubleclick.chart.hellocharts.provider.LineChartDataProvider;
import com.doubleclick.chart.hellocharts.view.Chart;
public class ComboLineColumnChartRenderer extends ComboChartRenderer {

    private ColumnChartRenderer columnChartRenderer;
    private LineChartRenderer lineChartRenderer;

    public ComboLineColumnChartRenderer(Context context, Chart chart, ColumnChartDataProvider columnChartDataProvider,
                                        LineChartDataProvider lineChartDataProvider) {
        this(context, chart, new ColumnChartRenderer(context, chart, columnChartDataProvider),
                new LineChartRenderer(context, chart, lineChartDataProvider));
    }

    public ComboLineColumnChartRenderer(Context context, Chart chart, ColumnChartRenderer columnChartRenderer,
                                        LineChartDataProvider lineChartDataProvider) {
        this(context, chart, columnChartRenderer, new LineChartRenderer(context, chart, lineChartDataProvider));
    }

    public ComboLineColumnChartRenderer(Context context, Chart chart, ColumnChartDataProvider columnChartDataProvider,
                                        LineChartRenderer lineChartRenderer) {
        this(context, chart, new ColumnChartRenderer(context, chart, columnChartDataProvider), lineChartRenderer);
    }

    public ComboLineColumnChartRenderer(Context context, Chart chart, ColumnChartRenderer columnChartRenderer,
                                        LineChartRenderer lineChartRenderer) {
        super(context, chart);

        this.columnChartRenderer = columnChartRenderer;
        this.lineChartRenderer = lineChartRenderer;

        renderers.add(this.columnChartRenderer);
        renderers.add(this.lineChartRenderer);
    }
}