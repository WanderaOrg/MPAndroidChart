package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class CustomLabelDrawJob {

    public abstract void drawLabel(Canvas c, String label, float x, float y, Paint paint);
}
