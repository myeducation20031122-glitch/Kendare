package p5;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r extends b5.a {
    public static final Parcelable.Creator<r> CREATOR = new x4.n(5);

    /* renamed from: b, reason: collision with root package name */
    public final int f15975b;

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f15976e;

    /* renamed from: f, reason: collision with root package name */
    public final IBinder f15977f;

    /* renamed from: j, reason: collision with root package name */
    public final PendingIntent f15978j;

    /* renamed from: m, reason: collision with root package name */
    public final String f15979m;

    /* renamed from: n, reason: collision with root package name */
    public final String f15980n;

    public r(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f15975b = i10;
        this.f15976e = iBinder;
        this.f15977f = iBinder2;
        this.f15978j = pendingIntent;
        this.f15979m = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f15980n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f15975b);
        com.bumptech.glide.e.V(parcel, 2, this.f15976e);
        com.bumptech.glide.e.V(parcel, 3, this.f15977f);
        com.bumptech.glide.e.W(parcel, 4, this.f15978j, i10);
        com.bumptech.glide.e.X(parcel, 5, this.f15979m);
        com.bumptech.glide.e.X(parcel, 6, this.f15980n);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}