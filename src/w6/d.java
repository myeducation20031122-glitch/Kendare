package w6;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import m.m3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends w0.b {
    public static final Parcelable.Creator<d> CREATOR = new m3(12);

    /* renamed from: f, reason: collision with root package name */
    public final int f18702f;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f18702f = parcel.readInt();
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18520b, i10);
        parcel.writeInt(this.f18702f);
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f18702f = sideSheetBehavior.f11515h;
    }
}