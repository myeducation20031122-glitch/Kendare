package x5;

import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements g, f, d {

    /* renamed from: b, reason: collision with root package name */
    public final Object f19014b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final int f19015e;

    /* renamed from: f, reason: collision with root package name */
    public final s f19016f;

    /* renamed from: j, reason: collision with root package name */
    public int f19017j;

    /* renamed from: m, reason: collision with root package name */
    public int f19018m;

    /* renamed from: n, reason: collision with root package name */
    public int f19019n;

    /* renamed from: t, reason: collision with root package name */
    public Exception f19020t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19021u;

    public n(int i10, s sVar) {
        this.f19015e = i10;
        this.f19016f = sVar;
    }

    public final void a() {
        int i10 = this.f19017j + this.f19018m + this.f19019n;
        int i11 = this.f19015e;
        if (i10 == i11) {
            Exception exc = this.f19020t;
            s sVar = this.f19016f;
            if (exc == null) {
                if (this.f19021u) {
                    sVar.o();
                    return;
                } else {
                    sVar.n(null);
                    return;
                }
            }
            sVar.m(new ExecutionException(this.f19018m + " out of " + i11 + " underlying tasks failed", this.f19020t));
        }
    }

    @Override // x5.f
    public final void f(Exception exc) {
        synchronized (this.f19014b) {
            this.f19018m++;
            this.f19020t = exc;
            a();
        }
    }

    @Override // x5.d
    public final void onCanceled() {
        synchronized (this.f19014b) {
            this.f19019n++;
            this.f19021u = true;
            a();
        }
    }

    @Override // x5.g
    public final void onSuccess(Object obj) {
        synchronized (this.f19014b) {
            this.f19017j++;
            a();
        }
    }
}