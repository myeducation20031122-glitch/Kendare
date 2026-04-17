package t5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d6 extends b5.a {
    public static final Parcelable.Creator<d6> CREATOR = new x4.n(22);
    public final long M;
    public final String N;
    public final long O;
    public final long P;
    public final int Q;
    public final boolean R;
    public final boolean S;
    public final String T;
    public final Boolean U;
    public final long V;
    public final List W;
    public final String X;
    public final String Y;
    public final String Z;

    /* renamed from: a0, reason: collision with root package name */
    public final String f17306a0;

    /* renamed from: b, reason: collision with root package name */
    public final String f17307b;

    /* renamed from: e, reason: collision with root package name */
    public final String f17308e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17309f;

    /* renamed from: j, reason: collision with root package name */
    public final String f17310j;

    /* renamed from: m, reason: collision with root package name */
    public final long f17311m;

    /* renamed from: n, reason: collision with root package name */
    public final long f17312n;

    /* renamed from: t, reason: collision with root package name */
    public final String f17313t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f17314u;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f17315w;

    public d6(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z7, boolean z10, String str6, long j13, int i10, boolean z11, boolean z12, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10) {
        fc.t.g(str);
        this.f17307b = str;
        this.f17308e = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f17309f = str3;
        this.M = j10;
        this.f17310j = str4;
        this.f17311m = j11;
        this.f17312n = j12;
        this.f17313t = str5;
        this.f17314u = z7;
        this.f17315w = z10;
        this.N = str6;
        this.O = 0L;
        this.P = j13;
        this.Q = i10;
        this.R = z11;
        this.S = z12;
        this.T = str7;
        this.U = bool;
        this.V = j14;
        this.W = list;
        this.X = null;
        this.Y = str8;
        this.Z = str9;
        this.f17306a0 = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 2, this.f17307b);
        com.bumptech.glide.e.X(parcel, 3, this.f17308e);
        com.bumptech.glide.e.X(parcel, 4, this.f17309f);
        com.bumptech.glide.e.X(parcel, 5, this.f17310j);
        com.bumptech.glide.e.i0(parcel, 6, 8);
        parcel.writeLong(this.f17311m);
        com.bumptech.glide.e.i0(parcel, 7, 8);
        parcel.writeLong(this.f17312n);
        com.bumptech.glide.e.X(parcel, 8, this.f17313t);
        com.bumptech.glide.e.i0(parcel, 9, 4);
        parcel.writeInt(this.f17314u ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 10, 4);
        parcel.writeInt(this.f17315w ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 11, 8);
        parcel.writeLong(this.M);
        com.bumptech.glide.e.X(parcel, 12, this.N);
        com.bumptech.glide.e.i0(parcel, 13, 8);
        parcel.writeLong(this.O);
        com.bumptech.glide.e.i0(parcel, 14, 8);
        parcel.writeLong(this.P);
        com.bumptech.glide.e.i0(parcel, 15, 4);
        parcel.writeInt(this.Q);
        com.bumptech.glide.e.i0(parcel, 16, 4);
        parcel.writeInt(this.R ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 18, 4);
        parcel.writeInt(this.S ? 1 : 0);
        com.bumptech.glide.e.X(parcel, 19, this.T);
        Boolean bool = this.U;
        if (bool != null) {
            com.bumptech.glide.e.i0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        com.bumptech.glide.e.i0(parcel, 22, 8);
        parcel.writeLong(this.V);
        com.bumptech.glide.e.Z(parcel, 23, this.W);
        com.bumptech.glide.e.X(parcel, 24, this.X);
        com.bumptech.glide.e.X(parcel, 25, this.Y);
        com.bumptech.glide.e.X(parcel, 26, this.Z);
        com.bumptech.glide.e.X(parcel, 27, this.f17306a0);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public d6(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z7, boolean z10, long j12, String str6, long j13, long j14, int i10, boolean z11, boolean z12, String str7, Boolean bool, long j15, ArrayList arrayList, String str8, String str9, String str10, String str11) {
        this.f17307b = str;
        this.f17308e = str2;
        this.f17309f = str3;
        this.M = j12;
        this.f17310j = str4;
        this.f17311m = j10;
        this.f17312n = j11;
        this.f17313t = str5;
        this.f17314u = z7;
        this.f17315w = z10;
        this.N = str6;
        this.O = j13;
        this.P = j14;
        this.Q = i10;
        this.R = z11;
        this.S = z12;
        this.T = str7;
        this.U = bool;
        this.V = j15;
        this.W = arrayList;
        this.X = str8;
        this.Y = str9;
        this.Z = str10;
        this.f17306a0 = str11;
    }
}