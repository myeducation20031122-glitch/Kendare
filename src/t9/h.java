package t9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new com.google.android.material.datepicker.d(5);

    /* renamed from: b, reason: collision with root package name */
    public String f18079b;

    /* renamed from: e, reason: collision with root package name */
    public String f18080e;

    /* renamed from: f, reason: collision with root package name */
    public String f18081f;

    /* renamed from: j, reason: collision with root package name */
    public Date f18082j;

    /* renamed from: m, reason: collision with root package name */
    public int f18083m;

    /* renamed from: n, reason: collision with root package name */
    public String f18084n;

    /* renamed from: t, reason: collision with root package name */
    public String f18085t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18086u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18079b);
        parcel.writeString(this.f18080e);
        parcel.writeString(this.f18081f);
        Date date = this.f18082j;
        parcel.writeLong(date != null ? date.getTime() : -1L);
        int i11 = this.f18083m;
        parcel.writeInt(i11 == 0 ? -1 : v.h.b(i11));
        parcel.writeString(this.f18084n);
        parcel.writeString(this.f18085t);
        parcel.writeByte(this.f18086u ? (byte) 1 : (byte) 0);
    }
}