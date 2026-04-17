package t1;

import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17015a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f17016b;

    public c(ViewGroup viewGroup) {
        this.f17016b = viewGroup;
    }

    @Override // t1.r
    public final void a(t tVar) {
        if (!this.f17015a) {
            i5.h.c(this.f17016b, false);
        }
        tVar.A(this);
    }

    @Override // t1.u, t1.r
    public final void d(t tVar) {
        i5.h.c(this.f17016b, false);
        this.f17015a = true;
    }

    @Override // t1.u, t1.r
    public final void e() {
        i5.h.c(this.f17016b, false);
    }

    @Override // t1.u, t1.r
    public final void f() {
        i5.h.c(this.f17016b, true);
    }
}