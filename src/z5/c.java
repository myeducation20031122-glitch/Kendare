package z5;

import android.animation.TimeInterpolator;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f19753a;

    /* renamed from: b, reason: collision with root package name */
    public long f19754b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f19755c;

    /* renamed from: d, reason: collision with root package name */
    public int f19756d;

    /* renamed from: e, reason: collision with root package name */
    public int f19757e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f19755c;
        return timeInterpolator != null ? timeInterpolator : a.f19747b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f19753a == cVar.f19753a && this.f19754b == cVar.f19754b && this.f19756d == cVar.f19756d && this.f19757e == cVar.f19757e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f19753a;
        long j11 = this.f19754b;
        return ((((a().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f19756d) * 31) + this.f19757e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f19753a);
        sb.append(" duration: ");
        sb.append(this.f19754b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f19756d);
        sb.append(" repeatMode: ");
        return r.f(sb, this.f19757e, "}\n");
    }
}