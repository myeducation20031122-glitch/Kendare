package a5;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f304a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f306c;

    /* renamed from: d, reason: collision with root package name */
    public final int f307d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f309f;

    public c0(f fVar, int i10, Bundle bundle) {
        this.f309f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f306c = fVar;
        this.f304a = bool;
        this.f305b = false;
        this.f307d = i10;
        this.f308e = bundle;
    }

    public final /* bridge */ void a() {
        x4.b bVar;
        f fVar = this.f309f;
        int i10 = this.f307d;
        if (i10 != 0) {
            fVar.I(1, null);
            Bundle bundle = this.f308e;
            bVar = new x4.b(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (c()) {
                return;
            }
            fVar.I(1, null);
            bVar = new x4.b(8, null);
        }
        b(bVar);
    }

    public abstract void b(x4.b bVar);

    public abstract boolean c();

    public final void d() {
        synchronized (this) {
            this.f304a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f306c.T) {
            this.f306c.T.remove(this);
        }
    }
}