package t5;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17369b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h5 f17370e;

    public /* synthetic */ g5(h5 h5Var, int i10) {
        this.f17369b = i10;
        this.f17370e = h5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17369b;
        h5 h5Var = this.f17370e;
        switch (i10) {
            case 0:
                i5 i5Var = h5Var.f17385f;
                Context context = ((b4) i5Var.f15046b).f17234b;
                ((b4) h5Var.f17385f.f15046b).getClass();
                i5.D(i5Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                break;
            default:
                i5 i5Var2 = h5Var.f17385f;
                i5Var2.f17428j = null;
                i5Var2.z();
                break;
        }
    }
}