package r5;

import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import fc.t;
import p5.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f16530a;

    /* renamed from: b, reason: collision with root package name */
    public long f16531b;

    /* renamed from: c, reason: collision with root package name */
    public long f16532c;

    /* renamed from: d, reason: collision with root package name */
    public long f16533d;

    /* renamed from: e, reason: collision with root package name */
    public long f16534e;

    /* renamed from: f, reason: collision with root package name */
    public int f16535f;

    /* renamed from: g, reason: collision with root package name */
    public float f16536g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16537h;

    /* renamed from: i, reason: collision with root package name */
    public long f16538i;

    /* renamed from: j, reason: collision with root package name */
    public int f16539j;

    /* renamed from: k, reason: collision with root package name */
    public int f16540k;

    /* renamed from: l, reason: collision with root package name */
    public String f16541l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16542m;

    /* renamed from: n, reason: collision with root package name */
    public WorkSource f16543n;

    /* renamed from: o, reason: collision with root package name */
    public p f16544o;

    public d(LocationRequest locationRequest) {
        this.f16530a = locationRequest.f11281b;
        this.f16531b = locationRequest.f11282e;
        this.f16532c = locationRequest.f11283f;
        this.f16533d = locationRequest.f11284j;
        this.f16534e = locationRequest.f11285m;
        this.f16535f = locationRequest.f11286n;
        this.f16536g = locationRequest.f11287t;
        this.f16537h = locationRequest.f11288u;
        this.f16538i = locationRequest.f11289w;
        this.f16539j = locationRequest.M;
        this.f16540k = locationRequest.N;
        this.f16541l = locationRequest.O;
        this.f16542m = locationRequest.P;
        this.f16543n = locationRequest.Q;
        this.f16544o = locationRequest.R;
    }

    public final LocationRequest a() {
        int i10 = this.f16530a;
        long j10 = this.f16531b;
        long jMin = this.f16532c;
        if (jMin == -1) {
            jMin = j10;
        } else if (i10 != 105) {
            jMin = Math.min(jMin, j10);
        }
        long j11 = this.f16533d;
        long j12 = this.f16531b;
        long jMax = Math.max(j11, j12);
        long j13 = this.f16534e;
        int i11 = this.f16535f;
        float f10 = this.f16536g;
        boolean z7 = this.f16537h;
        long j14 = this.f16538i;
        return new LocationRequest(i10, j10, jMin, jMax, Long.MAX_VALUE, j13, i11, f10, z7, j14 == -1 ? j12 : j14, this.f16539j, this.f16540k, this.f16541l, this.f16542m, new WorkSource(this.f16543n), this.f16544o);
    }

    public final void b(int i10) {
        int i11;
        boolean z7;
        if (i10 != 0 && i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = i10;
                z7 = false;
            }
            t.d(z7, "granularity %d must be a Granularity.GRANULARITY_* constant", new Object[]{Integer.valueOf(i11)});
            this.f16539j = i10;
        }
        i11 = i10;
        z7 = true;
        t.d(z7, "granularity %d must be a Granularity.GRANULARITY_* constant", new Object[]{Integer.valueOf(i11)});
        this.f16539j = i10;
    }

    public final void c(int i10) {
        int i11;
        boolean z7;
        if (i10 == 0 || i10 == 1) {
            i11 = i10;
        } else {
            i11 = 2;
            if (i10 != 2) {
                i11 = i10;
                z7 = false;
                t.d(z7, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", new Object[]{Integer.valueOf(i10)});
                this.f16540k = i11;
            }
            i10 = 2;
        }
        z7 = true;
        t.d(z7, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", new Object[]{Integer.valueOf(i10)});
        this.f16540k = i11;
    }
}