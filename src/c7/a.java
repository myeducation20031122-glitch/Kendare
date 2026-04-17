package c7;

import android.app.PendingIntent;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2140a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2141b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2142c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2143d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f2144e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f2145f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f2146g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f2147h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2148i = false;

    public a(int i10, int i11, long j10, long j11, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f2140a = i10;
        this.f2141b = i11;
        this.f2142c = j10;
        this.f2143d = j11;
        this.f2144e = pendingIntent;
        this.f2145f = pendingIntent2;
        this.f2146g = pendingIntent3;
        this.f2147h = pendingIntent4;
    }

    public final PendingIntent a(m mVar) {
        long j10 = this.f2143d;
        long j11 = this.f2142c;
        boolean z7 = mVar.f2178b;
        int i10 = mVar.f2177a;
        if (i10 == 0) {
            PendingIntent pendingIntent = this.f2145f;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (!z7 || j11 > j10) {
                return null;
            }
            return this.f2147h;
        }
        if (i10 == 1) {
            PendingIntent pendingIntent2 = this.f2144e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (z7 && j11 <= j10) {
                return this.f2146g;
            }
        }
        return null;
    }
}