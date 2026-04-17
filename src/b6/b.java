package b6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import x4.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new n(27);
    public String M;
    public Locale Q;
    public CharSequence R;
    public CharSequence S;
    public int T;
    public int U;
    public Integer V;
    public Integer X;
    public Integer Y;
    public Integer Z;

    /* renamed from: a0, reason: collision with root package name */
    public Integer f1943a0;

    /* renamed from: b, reason: collision with root package name */
    public int f1944b;

    /* renamed from: b0, reason: collision with root package name */
    public Integer f1945b0;

    /* renamed from: c0, reason: collision with root package name */
    public Integer f1946c0;

    /* renamed from: d0, reason: collision with root package name */
    public Integer f1947d0;

    /* renamed from: e, reason: collision with root package name */
    public Integer f1948e;

    /* renamed from: e0, reason: collision with root package name */
    public Integer f1949e0;

    /* renamed from: f, reason: collision with root package name */
    public Integer f1950f;

    /* renamed from: f0, reason: collision with root package name */
    public Integer f1951f0;

    /* renamed from: g0, reason: collision with root package name */
    public Boolean f1952g0;

    /* renamed from: j, reason: collision with root package name */
    public Integer f1953j;

    /* renamed from: m, reason: collision with root package name */
    public Integer f1954m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f1955n;

    /* renamed from: t, reason: collision with root package name */
    public Integer f1956t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f1957u;

    /* renamed from: w, reason: collision with root package name */
    public int f1958w = 255;
    public int N = -2;
    public int O = -2;
    public int P = -2;
    public Boolean W = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1944b);
        parcel.writeSerializable(this.f1948e);
        parcel.writeSerializable(this.f1950f);
        parcel.writeSerializable(this.f1953j);
        parcel.writeSerializable(this.f1954m);
        parcel.writeSerializable(this.f1955n);
        parcel.writeSerializable(this.f1956t);
        parcel.writeSerializable(this.f1957u);
        parcel.writeInt(this.f1958w);
        parcel.writeString(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        CharSequence charSequence = this.R;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.S;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.T);
        parcel.writeSerializable(this.V);
        parcel.writeSerializable(this.X);
        parcel.writeSerializable(this.Y);
        parcel.writeSerializable(this.Z);
        parcel.writeSerializable(this.f1943a0);
        parcel.writeSerializable(this.f1945b0);
        parcel.writeSerializable(this.f1946c0);
        parcel.writeSerializable(this.f1951f0);
        parcel.writeSerializable(this.f1947d0);
        parcel.writeSerializable(this.f1949e0);
        parcel.writeSerializable(this.W);
        parcel.writeSerializable(this.Q);
        parcel.writeSerializable(this.f1952g0);
    }
}