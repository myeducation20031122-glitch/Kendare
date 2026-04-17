package w0;

import android.os.Parcel;
import android.os.Parcelable;
import m.m3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f18520b;

    /* renamed from: e, reason: collision with root package name */
    public static final a f18519e = new a();
    public static final Parcelable.Creator<b> CREATOR = new m3(2);

    public b() {
        this.f18520b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18520b, i10);
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f18520b = parcelable == null ? f18519e : parcelable;
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f18520b = parcelable == f18519e ? null : parcelable;
    }
}