package j4;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c3 extends b5.a {
    public static final Parcelable.Creator<c3> CREATOR = new m2(5);
    public final x2 M;
    public final Location N;
    public final String O;
    public final Bundle P;
    public final Bundle Q;
    public final List R;
    public final String S;
    public final String T;
    public final boolean U;
    public final n0 V;
    public final int W;
    public final String X;
    public final List Y;
    public final int Z;

    /* renamed from: a0, reason: collision with root package name */
    public final String f13656a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f13657b;

    /* renamed from: e, reason: collision with root package name */
    public final long f13658e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f13659f;

    /* renamed from: j, reason: collision with root package name */
    public final int f13660j;

    /* renamed from: m, reason: collision with root package name */
    public final List f13661m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13662n;

    /* renamed from: t, reason: collision with root package name */
    public final int f13663t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f13664u;

    /* renamed from: w, reason: collision with root package name */
    public final String f13665w;

    public c3(int i10, long j10, Bundle bundle, int i11, List list, boolean z7, int i12, boolean z10, String str, x2 x2Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z11, n0 n0Var, int i13, String str5, List list3, int i14, String str6) {
        this.f13657b = i10;
        this.f13658e = j10;
        this.f13659f = bundle == null ? new Bundle() : bundle;
        this.f13660j = i11;
        this.f13661m = list;
        this.f13662n = z7;
        this.f13663t = i12;
        this.f13664u = z10;
        this.f13665w = str;
        this.M = x2Var;
        this.N = location;
        this.O = str2;
        this.P = bundle2 == null ? new Bundle() : bundle2;
        this.Q = bundle3;
        this.R = list2;
        this.S = str3;
        this.T = str4;
        this.U = z11;
        this.V = n0Var;
        this.W = i13;
        this.X = str5;
        this.Y = list3 == null ? new ArrayList() : list3;
        this.Z = i14;
        this.f13656a0 = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return this.f13657b == c3Var.f13657b && this.f13658e == c3Var.f13658e && com.bumptech.glide.f.E(this.f13659f, c3Var.f13659f) && this.f13660j == c3Var.f13660j && o5.y.i(this.f13661m, c3Var.f13661m) && this.f13662n == c3Var.f13662n && this.f13663t == c3Var.f13663t && this.f13664u == c3Var.f13664u && o5.y.i(this.f13665w, c3Var.f13665w) && o5.y.i(this.M, c3Var.M) && o5.y.i(this.N, c3Var.N) && o5.y.i(this.O, c3Var.O) && com.bumptech.glide.f.E(this.P, c3Var.P) && com.bumptech.glide.f.E(this.Q, c3Var.Q) && o5.y.i(this.R, c3Var.R) && o5.y.i(this.S, c3Var.S) && o5.y.i(this.T, c3Var.T) && this.U == c3Var.U && this.W == c3Var.W && o5.y.i(this.X, c3Var.X) && o5.y.i(this.Y, c3Var.Y) && this.Z == c3Var.Z && o5.y.i(this.f13656a0, c3Var.f13656a0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13657b), Long.valueOf(this.f13658e), this.f13659f, Integer.valueOf(this.f13660j), this.f13661m, Boolean.valueOf(this.f13662n), Integer.valueOf(this.f13663t), Boolean.valueOf(this.f13664u), this.f13665w, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, Boolean.valueOf(this.U), Integer.valueOf(this.W), this.X, this.Y, Integer.valueOf(this.Z), this.f13656a0});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f13657b);
        com.bumptech.glide.e.i0(parcel, 2, 8);
        parcel.writeLong(this.f13658e);
        com.bumptech.glide.e.T(parcel, 3, this.f13659f);
        com.bumptech.glide.e.i0(parcel, 4, 4);
        parcel.writeInt(this.f13660j);
        com.bumptech.glide.e.Z(parcel, 5, this.f13661m);
        com.bumptech.glide.e.i0(parcel, 6, 4);
        parcel.writeInt(this.f13662n ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 7, 4);
        parcel.writeInt(this.f13663t);
        com.bumptech.glide.e.i0(parcel, 8, 4);
        parcel.writeInt(this.f13664u ? 1 : 0);
        com.bumptech.glide.e.X(parcel, 9, this.f13665w);
        com.bumptech.glide.e.W(parcel, 10, this.M, i10);
        com.bumptech.glide.e.W(parcel, 11, this.N, i10);
        com.bumptech.glide.e.X(parcel, 12, this.O);
        com.bumptech.glide.e.T(parcel, 13, this.P);
        com.bumptech.glide.e.T(parcel, 14, this.Q);
        com.bumptech.glide.e.Z(parcel, 15, this.R);
        com.bumptech.glide.e.X(parcel, 16, this.S);
        com.bumptech.glide.e.X(parcel, 17, this.T);
        com.bumptech.glide.e.i0(parcel, 18, 4);
        parcel.writeInt(this.U ? 1 : 0);
        com.bumptech.glide.e.W(parcel, 19, this.V, i10);
        com.bumptech.glide.e.i0(parcel, 20, 4);
        parcel.writeInt(this.W);
        com.bumptech.glide.e.X(parcel, 21, this.X);
        com.bumptech.glide.e.Z(parcel, 22, this.Y);
        com.bumptech.glide.e.i0(parcel, 23, 4);
        parcel.writeInt(this.Z);
        com.bumptech.glide.e.X(parcel, 24, this.f13656a0);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}