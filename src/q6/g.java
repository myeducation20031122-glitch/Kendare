package q6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new com.google.android.material.datepicker.d(2);

    /* renamed from: b, reason: collision with root package name */
    public int f16301b;

    /* renamed from: e, reason: collision with root package name */
    public p6.f f16302e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16301b);
        parcel.writeParcelable(this.f16302e, 0);
    }
}