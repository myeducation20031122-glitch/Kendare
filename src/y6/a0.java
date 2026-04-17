package y6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import m.m3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 extends w0.b {
    public static final Parcelable.Creator<a0> CREATOR = new m3(13);

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f19292f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19293j;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f19292f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f19293j = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f19292f) + "}";
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18520b, i10);
        TextUtils.writeToParcel(this.f19292f, parcel, i10);
        parcel.writeInt(this.f19293j ? 1 : 0);
    }
}