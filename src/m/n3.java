package m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n3 extends w0.b {
    public static final Parcelable.Creator<n3> CREATOR = new m3(0);

    /* renamed from: f, reason: collision with root package name */
    public int f14855f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14856j;

    public n3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14855f = parcel.readInt();
        this.f14856j = parcel.readInt() != 0;
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18520b, i10);
        parcel.writeInt(this.f14855f);
        parcel.writeInt(this.f14856j ? 1 : 0);
    }
}