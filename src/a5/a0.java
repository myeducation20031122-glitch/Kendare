package a5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 extends b5.a {
    public static final Parcelable.Creator<a0> CREATOR = new m2(24);

    /* renamed from: b, reason: collision with root package name */
    public final int f295b;

    /* renamed from: e, reason: collision with root package name */
    public final Account f296e;

    /* renamed from: f, reason: collision with root package name */
    public final int f297f;

    /* renamed from: j, reason: collision with root package name */
    public final GoogleSignInAccount f298j;

    public a0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f295b = i10;
        this.f296e = account;
        this.f297f = i11;
        this.f298j = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f295b);
        com.bumptech.glide.e.W(parcel, 2, this.f296e, i10);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f297f);
        com.bumptech.glide.e.W(parcel, 4, this.f298j, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}