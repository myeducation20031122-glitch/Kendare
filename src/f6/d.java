package f6;

import android.view.View;
import android.view.WindowInsets;
import java.util.Iterator;
import java.util.List;
import o0.m2;
import o0.y1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f12701a;

    /* renamed from: b, reason: collision with root package name */
    public final View f12702b;

    /* renamed from: c, reason: collision with root package name */
    public int f12703c;

    /* renamed from: d, reason: collision with root package name */
    public int f12704d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f12705e = new int[2];

    public d(View view) {
        this.f12702b = view;
    }

    public final void a(m2 m2Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((y1) it.next()).f15646a.c() & 8) != 0) {
                this.f12702b.setTranslationY(z5.a.c(this.f12704d, r3.f15646a.b(), 0));
                return;
            }
        }
    }
}