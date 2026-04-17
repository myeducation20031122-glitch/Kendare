package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import m.m3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends w0.b {
    public static final Parcelable.Creator<c> CREATOR = new m3(7);

    /* renamed from: f, reason: collision with root package name */
    public final int f12696f;

    /* renamed from: j, reason: collision with root package name */
    public final int f12697j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f12698m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f12699n;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f12700t;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12696f = parcel.readInt();
        this.f12697j = parcel.readInt();
        this.f12698m = parcel.readInt() == 1;
        this.f12699n = parcel.readInt() == 1;
        this.f12700t = parcel.readInt() == 1;
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18520b, i10);
        parcel.writeInt(this.f12696f);
        parcel.writeInt(this.f12697j);
        parcel.writeInt(this.f12698m ? 1 : 0);
        parcel.writeInt(this.f12699n ? 1 : 0);
        parcel.writeInt(this.f12700t ? 1 : 0);
    }

    public c(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f12696f = bottomSheetBehavior.L;
        this.f12697j = bottomSheetBehavior.f11361e;
        this.f12698m = bottomSheetBehavior.f11355b;
        this.f12699n = bottomSheetBehavior.I;
        this.f12700t = bottomSheetBehavior.J;
    }
}