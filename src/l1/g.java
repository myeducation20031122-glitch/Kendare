package l1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.ht0;
import com.google.android.gms.internal.ads.kt0;
import com.google.android.gms.internal.ads.lt0;
import com.google.android.gms.internal.ads.ot0;
import com.google.android.gms.internal.ads.z9;
import com.onesignal.v0;
import g.i0;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements a5.b, a5.c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f14471b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14472e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14473f;

    /* renamed from: j, reason: collision with root package name */
    public final Object f14474j;

    /* renamed from: m, reason: collision with root package name */
    public Object f14475m;

    public g() {
        this.f14471b = false;
        this.f14474j = new WeakHashMap();
        this.f14473f = new i0(this, 4);
    }

    @Override // a5.b
    public final void A(int i10) {
    }

    @Override // a5.b
    public final void T(Bundle bundle) {
        synchronized (this.f14475m) {
            try {
                if (this.f14472e) {
                    return;
                }
                this.f14472e = true;
                try {
                    ot0 ot0Var = (ot0) ((lt0) this.f14473f).z();
                    kt0 kt0Var = new kt0(((ht0) this.f14474j).d(), 1);
                    Parcel parcelT = ot0Var.T();
                    z9.c(parcelT, kt0Var);
                    ot0Var.q2(parcelT, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    c();
                    throw th;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (this.f14471b && !this.f14472e) {
                    int length = ((long[]) this.f14473f).length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 >= length) {
                            this.f14472e = true;
                            this.f14471b = false;
                            return (int[]) this.f14475m;
                        }
                        boolean z7 = ((long[]) this.f14473f)[i10] > 0;
                        Object obj = this.f14474j;
                        if (z7 != ((boolean[]) obj)[i10]) {
                            int[] iArr = (int[]) this.f14475m;
                            if (!z7) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            ((int[]) this.f14475m)[i10] = 0;
                        }
                        ((boolean[]) obj)[i10] = z7;
                        i10++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public final synchronized void b(Context context) {
        try {
            if (this.f14471b) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f14475m = applicationContext;
            if (applicationContext == null) {
                this.f14475m = context;
            }
            ge.a((Context) this.f14475m);
            ce ceVar = ge.f4677e3;
            j4.q qVar = j4.q.f13781d;
            this.f14472e = ((Boolean) qVar.f13784c.a(ceVar)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) qVar.f13784c.a(ge.B8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.f14475m).registerReceiver((BroadcastReceiver) this.f14473f, intentFilter);
            } else {
                v0.t((Context) this.f14475m, (BroadcastReceiver) this.f14473f, intentFilter);
            }
            this.f14471b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        synchronized (this.f14475m) {
            try {
                if (((lt0) this.f14473f).a() || ((lt0) this.f14473f).D()) {
                    ((lt0) this.f14473f).m();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f14472e) {
            ((Map) this.f14474j).remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    @Override // a5.c
    public final void x(x4.b bVar) {
    }

    public g(int i10) {
        long[] jArr = new long[i10];
        this.f14473f = jArr;
        boolean[] zArr = new boolean[i10];
        this.f14474j = zArr;
        this.f14475m = new int[i10];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public g(Context context, Looper looper, ht0 ht0Var) {
        this.f14475m = new Object();
        this.f14471b = false;
        this.f14472e = false;
        this.f14474j = ht0Var;
        this.f14473f = new lt0(context, looper, this, this, 12800000);
    }
}