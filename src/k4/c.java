package k4;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends b5.a {
    public static final Parcelable.Creator<c> CREATOR = new m2(10);
    public final boolean M;

    /* renamed from: b, reason: collision with root package name */
    public final String f13981b;

    /* renamed from: e, reason: collision with root package name */
    public final String f13982e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13983f;

    /* renamed from: j, reason: collision with root package name */
    public final String f13984j;

    /* renamed from: m, reason: collision with root package name */
    public final String f13985m;

    /* renamed from: n, reason: collision with root package name */
    public final String f13986n;

    /* renamed from: t, reason: collision with root package name */
    public final String f13987t;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f13988u;

    /* renamed from: w, reason: collision with root package name */
    public final l f13989w;

    public c(Intent intent, l lVar) {
        this(null, null, null, null, null, null, null, intent, new h5.b(lVar), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 2, this.f13981b);
        com.bumptech.glide.e.X(parcel, 3, this.f13982e);
        com.bumptech.glide.e.X(parcel, 4, this.f13983f);
        com.bumptech.glide.e.X(parcel, 5, this.f13984j);
        com.bumptech.glide.e.X(parcel, 6, this.f13985m);
        com.bumptech.glide.e.X(parcel, 7, this.f13986n);
        com.bumptech.glide.e.X(parcel, 8, this.f13987t);
        com.bumptech.glide.e.W(parcel, 9, this.f13988u, i10);
        com.bumptech.glide.e.V(parcel, 10, new h5.b(this.f13989w));
        com.bumptech.glide.e.i0(parcel, 11, 4);
        parcel.writeInt(this.M ? 1 : 0);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z7) {
        this.f13981b = str;
        this.f13982e = str2;
        this.f13983f = str3;
        this.f13984j = str4;
        this.f13985m = str5;
        this.f13986n = str6;
        this.f13987t = str7;
        this.f13988u = intent;
        this.f13989w = (l) h5.b.r3(h5.b.q3(iBinder));
        this.M = z7;
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, l lVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new h5.b(lVar), false);
    }
}