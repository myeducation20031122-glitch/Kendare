package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t0 extends View.BaseSavedState {
    public static final Parcelable.Creator<t0> CREATOR = new android.support.v4.media.a(13);

    /* renamed from: b, reason: collision with root package name */
    public boolean f14941b;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f14941b ? (byte) 1 : (byte) 0);
    }
}