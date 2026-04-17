package c0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import m.m3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends w0.b {
    public static final Parcelable.Creator<g> CREATOR = new m3(1);

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f2035f;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        int[] iArr = new int[i10];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f2035f = new SparseArray(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f2035f.append(iArr[i11], parcelableArray[i11]);
        }
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18520b, i10);
        SparseArray sparseArray = this.f2035f;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f2035f.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f2035f.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}