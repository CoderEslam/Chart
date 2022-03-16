package com.doubleclick.chart.hellocharts.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import com.doubleclick.chart.hellocharts.computator.PreviewChartComputator;
import com.doubleclick.chart.hellocharts.gesture.PreviewChartTouchHandler;
import com.doubleclick.chart.hellocharts.model.LineChartData;
import com.doubleclick.chart.hellocharts.renderer.PreviewLineChartRenderer;


public class PreviewLineChartView extends LineChartView {
    private static final String TAG = "PreviewLineChartView";

    protected PreviewLineChartRenderer previewChartRenderer;

    public PreviewLineChartView(Context context) {
        this(context, null, 0);
    }

    public PreviewLineChartView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PreviewLineChartView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        chartComputator = new PreviewChartComputator();
        previewChartRenderer = new PreviewLineChartRenderer(context, this, this);
        touchHandler = new PreviewChartTouchHandler(context, this);
        setChartRenderer(previewChartRenderer);
        setLineChartData(LineChartData.generateDummyData());
    }

    public int getPreviewColor() {
        return previewChartRenderer.getPreviewColor();
    }

    public void setPreviewColor(int color) {
//        if (BuildConfig.DEBUG) {
//            Log.d(TAG, "Changing preview area color");
//        }

        previewChartRenderer.setPreviewColor(color);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        final int offset = computeHorizontalScrollOffset();
        final int range = computeHorizontalScrollRange() - computeHorizontalScrollExtent();
        if (range == 0) return false;
        if (direction < 0) {
            return offset > 0;
        } else {
            return offset < range - 1;
        }
    }
}
