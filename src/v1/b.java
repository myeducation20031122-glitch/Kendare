package v1;

import android.os.Parcel;
import android.util.SparseIntArray;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f18366d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f18367e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18368f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18369g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18370h;

    /* renamed from: i, reason: collision with root package name */
    public int f18371i;

    /* renamed from: j, reason: collision with root package name */
    public int f18372j;

    /* renamed from: k, reason: collision with root package name */
    public int f18373k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new t.b(), new t.b(), new t.b());
    }

    @Override // v1.a
    public final b a() {
        Parcel parcel = this.f18367e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f18372j;
        if (i10 == this.f18368f) {
            i10 = this.f18369g;
        }
        return new b(parcel, iDataPosition, i10, r.g(new StringBuilder(), this.f18370h, "  "), this.f18363a, this.f18364b, this.f18365c);
    }

    @Override // v1.a
    public final boolean e(int i10) {
        while (this.f18372j < this.f18369g) {
            int i11 = this.f18373k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f18372j;
            Parcel parcel = this.f18367e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f18373k = parcel.readInt();
            this.f18372j += i13;
        }
        return this.f18373k == i10;
    }

    @Override // v1.a
    public final void i(int i10) {
        int i11 = this.f18371i;
        SparseIntArray sparseIntArray = this.f18366d;
        Parcel parcel = this.f18367e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f18371i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, t.b bVar, t.b bVar2, t.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f18366d = new SparseIntArray();
        this.f18371i = -1;
        this.f18373k = -1;
        this.f18367e = parcel;
        this.f18368f = i10;
        this.f18369g = i11;
        this.f18372j = i10;
        this.f18370h = str;
    }
}