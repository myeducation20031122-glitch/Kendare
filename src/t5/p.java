package t5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.j6;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends b5.a implements Iterable {
    public static final Parcelable.Creator<p> CREATOR = new x4.n(19);

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f17544b;

    public p(Bundle bundle) {
        this.f17544b = bundle;
    }

    public final Bundle h() {
        return new Bundle(this.f17544b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j6(this);
    }

    public final Double l() {
        return Double.valueOf(this.f17544b.getDouble("value"));
    }

    public final Object m(String str) {
        return this.f17544b.get(str);
    }

    public final String toString() {
        return this.f17544b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.T(parcel, 2, h());
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}