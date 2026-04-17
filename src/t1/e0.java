package t1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import m.b3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f17033a;

    /* renamed from: b, reason: collision with root package name */
    public static final b3 f17034b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f17033a = i10 >= 29 ? new n0() : i10 >= 23 ? new m0() : i10 >= 22 ? new k0() : new h0();
        f17034b = new b3(6, Float.class, "translationAlpha");
        new b3(7, Rect.class, "clipBounds");
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f17033a.h(view, i10, i11, i12, i13);
    }

    public static void b(View view, int i10) {
        f17033a.j(view, i10);
    }
}