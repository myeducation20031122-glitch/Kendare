package j4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h3 extends b5.a {
    public static final Parcelable.Creator<h3> CREATOR = new m2(8);

    /* renamed from: b, reason: collision with root package name */
    public final String f13724b;

    /* renamed from: e, reason: collision with root package name */
    public long f13725e;

    /* renamed from: f, reason: collision with root package name */
    public e2 f13726f;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f13727j;

    /* renamed from: m, reason: collision with root package name */
    public final String f13728m;

    /* renamed from: n, reason: collision with root package name */
    public final String f13729n;

    /* renamed from: t, reason: collision with root package name */
    public final String f13730t;

    /* renamed from: u, reason: collision with root package name */
    public final String f13731u;

    public h3(String str, long j10, e2 e2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f13724b = str;
        this.f13725e = j10;
        this.f13726f = e2Var;
        this.f13727j = bundle;
        this.f13728m = str2;
        this.f13729n = str3;
        this.f13730t = str4;
        this.f13731u = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 1, this.f13724b);
        long j10 = this.f13725e;
        com.bumptech.glide.e.i0(parcel, 2, 8);
        parcel.writeLong(j10);
        com.bumptech.glide.e.W(parcel, 3, this.f13726f, i10);
        com.bumptech.glide.e.T(parcel, 4, this.f13727j);
        com.bumptech.glide.e.X(parcel, 5, this.f13728m);
        com.bumptech.glide.e.X(parcel, 6, this.f13729n);
        com.bumptech.glide.e.X(parcel, 7, this.f13730t);
        com.bumptech.glide.e.X(parcel, 8, this.f13731u);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}