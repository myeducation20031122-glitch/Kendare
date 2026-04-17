package f4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends b5.a {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(26);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12675b;

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f12676e;

    public a(boolean z7, IBinder iBinder) {
        this.f12675b = z7;
        this.f12676e = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f12675b ? 1 : 0);
        com.bumptech.glide.e.V(parcel, 2, this.f12676e);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}