package y1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import m.m3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o extends View.BaseSavedState {
    public static final Parcelable.Creator<o> CREATOR = new m3(6);

    /* renamed from: b, reason: collision with root package name */
    public int f19220b;

    /* renamed from: e, reason: collision with root package name */
    public int f19221e;

    /* renamed from: f, reason: collision with root package name */
    public Parcelable f19222f;

    public o(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f19220b = parcel.readInt();
        this.f19221e = parcel.readInt();
        this.f19222f = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f19220b);
        parcel.writeInt(this.f19221e);
        parcel.writeParcelable(this.f19222f, i10);
    }
}