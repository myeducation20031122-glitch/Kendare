package b4;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends m1 implements b {
    public static final Parcelable.Creator<f> CREATOR = new android.support.v4.media.a(24);
    public int M;
    public int N;
    public int O;
    public boolean P;

    /* renamed from: m, reason: collision with root package name */
    public float f1917m;

    /* renamed from: n, reason: collision with root package name */
    public float f1918n;

    /* renamed from: t, reason: collision with root package name */
    public int f1919t;

    /* renamed from: u, reason: collision with root package name */
    public float f1920u;

    /* renamed from: w, reason: collision with root package name */
    public int f1921w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f1917m);
        parcel.writeFloat(this.f1918n);
        parcel.writeInt(this.f1919t);
        parcel.writeFloat(this.f1920u);
        parcel.writeInt(this.f1921w);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        parcel.writeByte(this.P ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}