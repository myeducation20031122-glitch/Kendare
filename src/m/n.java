package m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new android.support.v4.media.a(12);

    /* renamed from: b, reason: collision with root package name */
    public int f14851b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14851b);
    }
}