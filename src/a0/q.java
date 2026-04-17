package a0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends View {

    /* renamed from: b, reason: collision with root package name */
    public boolean f166b;

    public q(Context context) {
        super(context);
        this.f166b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z7) {
        this.f166b = z7;
    }

    public void setGuidelineBegin(int i10) {
        e eVar = (e) getLayoutParams();
        if (this.f166b && eVar.f19a == i10) {
            return;
        }
        eVar.f19a = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i10) {
        e eVar = (e) getLayoutParams();
        if (this.f166b && eVar.f21b == i10) {
            return;
        }
        eVar.f21b = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f10) {
        e eVar = (e) getLayoutParams();
        if (this.f166b && eVar.f23c == f10) {
            return;
        }
        eVar.f23c = f10;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}