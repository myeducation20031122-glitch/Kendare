package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import m.m3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends w0.b {
    public static final Parcelable.Creator<k> CREATOR = new m3(11);

    /* renamed from: f, reason: collision with root package name */
    public Bundle f16306f;

    public k(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16306f = parcel.readBundle(classLoader == null ? k.class.getClassLoader() : classLoader);
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18520b, i10);
        parcel.writeBundle(this.f16306f);
    }
}