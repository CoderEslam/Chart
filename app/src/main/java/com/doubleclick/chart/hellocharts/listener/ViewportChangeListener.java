package com.doubleclick.chart.hellocharts.listener;


import com.doubleclick.chart.hellocharts.model.Viewport;

public interface ViewportChangeListener {

    /**
     * Called when current viewport of chart changed. You should not modify that viewport.
     */
    public void onViewportChanged(Viewport viewport);

}
