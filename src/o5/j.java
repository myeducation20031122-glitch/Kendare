package o5;

import android.app.Application;
import android.app.Dialog;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Application f15746a;

    /* renamed from: b, reason: collision with root package name */
    public final p f15747b;

    /* renamed from: c, reason: collision with root package name */
    public final f f15748c;

    /* renamed from: d, reason: collision with root package name */
    public final m f15749d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f15750e;

    /* renamed from: f, reason: collision with root package name */
    public Dialog f15751f;

    /* renamed from: g, reason: collision with root package name */
    public n f15752g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f15753h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f15754i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f15755j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f15756k = new AtomicReference();

    public j(Application application, p pVar, f fVar, m mVar, c0 c0Var) {
        this.f15746a = application;
        this.f15747b = pVar;
        this.f15748c = fVar;
        this.f15749d = mVar;
        this.f15750e = c0Var;
    }

    public final void a() {
        Dialog dialog = this.f15751f;
        if (dialog != null) {
            dialog.dismiss();
            this.f15751f = null;
        }
        this.f15747b.f15776a = null;
        h hVar = (h) this.f15756k.getAndSet(null);
        if (hVar != null) {
            hVar.f15737e.f15746a.unregisterActivityLifecycleCallbacks(hVar);
        }
    }
}