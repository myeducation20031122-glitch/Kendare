package a6;

import android.view.View;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final View f454a;

    /* renamed from: b, reason: collision with root package name */
    public int f455b;

    /* renamed from: c, reason: collision with root package name */
    public int f456c;

    /* renamed from: d, reason: collision with root package name */
    public int f457d;

    public h(View view) {
        this.f454a = view;
    }

    public final void a() {
        int i10 = this.f457d;
        View view = this.f454a;
        c1.l(view, i10 - (view.getTop() - this.f455b));
        c1.k(view, 0 - (view.getLeft() - this.f456c));
    }
}