package t5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends b5.a {
    public static final Parcelable.Creator<c> CREATOR = new x4.n(18);
    public final long M;
    public final q N;

    /* renamed from: b, reason: collision with root package name */
    public String f17265b;

    /* renamed from: e, reason: collision with root package name */
    public String f17266e;

    /* renamed from: f, reason: collision with root package name */
    public y5 f17267f;

    /* renamed from: j, reason: collision with root package name */
    public long f17268j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17269m;

    /* renamed from: n, reason: collision with root package name */
    public String f17270n;

    /* renamed from: t, reason: collision with root package name */
    public final q f17271t;

    /* renamed from: u, reason: collision with root package name */
    public long f17272u;

    /* renamed from: w, reason: collision with root package name */
    public q f17273w;

    public c(String str, String str2, y5 y5Var, long j10, boolean z7, String str3, q qVar, long j11, q qVar2, long j12, q qVar3) {
        this.f17265b = str;
        this.f17266e = str2;
        this.f17267f = y5Var;
        this.f17268j = j10;
        this.f17269m = z7;
        this.f17270n = str3;
        this.f17271t = qVar;
        this.f17272u = j11;
        this.f17273w = qVar2;
        this.M = j12;
        this.N = qVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 2, this.f17265b);
        com.bumptech.glide.e.X(parcel, 3, this.f17266e);
        com.bumptech.glide.e.W(parcel, 4, this.f17267f, i10);
        long j10 = this.f17268j;
        com.bumptech.glide.e.i0(parcel, 5, 8);
        parcel.writeLong(j10);
        boolean z7 = this.f17269m;
        com.bumptech.glide.e.i0(parcel, 6, 4);
        parcel.writeInt(z7 ? 1 : 0);
        com.bumptech.glide.e.X(parcel, 7, this.f17270n);
        com.bumptech.glide.e.W(parcel, 8, this.f17271t, i10);
        long j11 = this.f17272u;
        com.bumptech.glide.e.i0(parcel, 9, 8);
        parcel.writeLong(j11);
        com.bumptech.glide.e.W(parcel, 10, this.f17273w, i10);
        com.bumptech.glide.e.i0(parcel, 11, 8);
        parcel.writeLong(this.M);
        com.bumptech.glide.e.W(parcel, 12, this.N, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public c(c cVar) {
        fc.t.k(cVar);
        this.f17265b = cVar.f17265b;
        this.f17266e = cVar.f17266e;
        this.f17267f = cVar.f17267f;
        this.f17268j = cVar.f17268j;
        this.f17269m = cVar.f17269m;
        this.f17270n = cVar.f17270n;
        this.f17271t = cVar.f17271t;
        this.f17272u = cVar.f17272u;
        this.f17273w = cVar.f17273w;
        this.M = cVar.M;
        this.N = cVar.N;
    }
}