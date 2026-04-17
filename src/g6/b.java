package g6;

import android.os.Parcel;
import android.os.Parcelable;
import m.m3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends w0.b {
    public static final Parcelable.Creator<b> CREATOR = new m3(8);

    /* renamed from: f, reason: collision with root package name */
    public boolean f13051f;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f13051f = parcel.readInt() == 1;
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18520b, i10);
        parcel.writeInt(this.f13051f ? 1 : 0);
    }
}