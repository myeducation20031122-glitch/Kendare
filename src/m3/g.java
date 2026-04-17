package m3;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g extends f {

    /* renamed from: e0, reason: collision with root package name */
    public final f[] f15181e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f15182f0;

    public g() {
        f[] fVarArrL = l();
        this.f15181e0 = fVarArrL;
        if (fVarArrL != null) {
            for (f fVar : fVarArrL) {
                fVar.setCallback(this);
            }
        }
        k(this.f15181e0);
    }

    @Override // m3.f
    public final void b(Canvas canvas) {
    }

    @Override // m3.f
    public final int c() {
        return this.f15182f0;
    }

    @Override // m3.f
    public ValueAnimator d() {
        return null;
    }

    @Override // m3.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        h(canvas);
    }

    @Override // m3.f
    public final void e(int i10) {
        this.f15182f0 = i10;
        for (int i11 = 0; i11 < j(); i11++) {
            i(i11).e(i10);
        }
    }

    public void h(Canvas canvas) {
        f[] fVarArr = this.f15181e0;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                int iSave = canvas.save();
                fVar.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final f i(int i10) {
        f[] fVarArr = this.f15181e0;
        if (fVarArr == null) {
            return null;
        }
        return fVarArr[i10];
    }

    @Override // m3.f, android.graphics.drawable.Animatable
    public final boolean isRunning() {
        f[] fVarArr = this.f15181e0;
        int length = fVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                if (super.isRunning()) {
                    break;
                }
                return false;
            }
            if (fVarArr[i10].isRunning()) {
                break;
            }
            i10++;
        }
        return true;
    }

    public final int j() {
        f[] fVarArr = this.f15181e0;
        if (fVarArr == null) {
            return 0;
        }
        return fVarArr.length;
    }

    public void k(f... fVarArr) {
    }

    public abstract f[] l();

    @Override // m3.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (f fVar : this.f15181e0) {
            fVar.setBounds(rect);
        }
    }

    @Override // m3.f, android.graphics.drawable.Animatable
    public final void start() {
        super.start();
        for (f fVar : this.f15181e0) {
            fVar.start();
        }
    }

    @Override // m3.f, android.graphics.drawable.Animatable
    public final void stop() {
        super.stop();
        for (f fVar : this.f15181e0) {
            fVar.stop();
        }
    }
}