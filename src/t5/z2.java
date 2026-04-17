package t5;

import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z2 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f17706g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f17707a;

    /* renamed from: b, reason: collision with root package name */
    public final y2 f17708b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17709c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17710d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f17711e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f17712f = null;

    public /* synthetic */ z2(String str, Object obj, Object obj2, y2 y2Var) {
        this.f17707a = str;
        this.f17709c = obj;
        this.f17710d = obj2;
        this.f17708b = y2Var;
    }

    public final Object a(Object obj) {
        synchronized (this.f17711e) {
        }
        if (obj != null) {
            return obj;
        }
        if (dq0.f3772z == null) {
            return this.f17709c;
        }
        synchronized (f17706g) {
            try {
                if (w2.k.i()) {
                    return this.f17712f == null ? this.f17709c : this.f17712f;
                }
                try {
                    for (z2 z2Var : a3.f17163a) {
                        if (w2.k.i()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            y2 y2Var = z2Var.f17708b;
                            if (y2Var != null) {
                                objZza = y2Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f17706g) {
                            z2Var.f17712f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                y2 y2Var2 = this.f17708b;
                if (y2Var2 == null) {
                    return this.f17709c;
                }
                try {
                    return y2Var2.zza();
                } catch (IllegalStateException unused3) {
                    return this.f17709c;
                } catch (SecurityException unused4) {
                    return this.f17709c;
                }
            } finally {
            }
        }
    }
}