package t5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y5 extends b5.a {
    public static final Parcelable.Creator<y5> CREATOR = new x4.n(21);

    /* renamed from: b, reason: collision with root package name */
    public final int f17696b;

    /* renamed from: e, reason: collision with root package name */
    public final String f17697e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17698f;

    /* renamed from: j, reason: collision with root package name */
    public final Long f17699j;

    /* renamed from: m, reason: collision with root package name */
    public final String f17700m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17701n;

    /* renamed from: t, reason: collision with root package name */
    public final Double f17702t;

    public y5(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f17696b = i10;
        this.f17697e = str;
        this.f17698f = j10;
        this.f17699j = l10;
        if (i10 == 1) {
            this.f17702t = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f17702t = d10;
        }
        this.f17700m = str2;
        this.f17701n = str3;
    }

    public final Object h() {
        Long l10 = this.f17699j;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f17702t;
        if (d10 != null) {
            return d10;
        }
        String str = this.f17700m;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        x4.n.b(this, parcel);
    }

    public y5(long j10, Object obj, String str, String str2) {
        fc.t.g(str);
        this.f17696b = 2;
        this.f17697e = str;
        this.f17698f = j10;
        this.f17701n = str2;
        if (obj == null) {
            this.f17699j = null;
            this.f17702t = null;
            this.f17700m = null;
            return;
        }
        if (obj instanceof Long) {
            this.f17699j = (Long) obj;
            this.f17702t = null;
            this.f17700m = null;
        } else if (obj instanceof String) {
            this.f17699j = null;
            this.f17702t = null;
            this.f17700m = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f17699j = null;
            this.f17702t = (Double) obj;
            this.f17700m = null;
        }
    }

    public y5(z5 z5Var) {
        this(z5Var.f17725d, z5Var.f17726e, z5Var.f17724c, z5Var.f17723b);
    }
}