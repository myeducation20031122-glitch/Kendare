package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j0 extends RatingBar {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f14801b;

    public j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130904044);
        d3.a(getContext(), this);
        h0 h0Var = new h0(this);
        this.f14801b = h0Var;
        h0Var.a(attributeSet, 2130904044);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = this.f14801b.f14784b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}