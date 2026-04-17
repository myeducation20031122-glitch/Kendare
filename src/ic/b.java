package ic;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new com.google.android.material.datepicker.d(7);
    public final int b;
    public final String e;
    public final String f;
    public final String j;
    public final String m;
    public final int n;
    public final int t;
    public Object u;
    public Context w;

    public b(Parcel parcel) {
        this.b = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.j = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.t = parcel.readInt();
    }

    public final void a(Object obj) {
        Context context;
        this.u = obj;
        if (obj instanceof Activity) {
            context = (Activity) obj;
        } else {
            if (!(obj instanceof Fragment)) {
                throw new IllegalStateException("Unknown object: " + obj);
            }
            context = ((Fragment) obj).getContext();
        }
        this.w = context;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.j);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.t);
    }

    public b(Object obj, String str, String str2, String str3, String str4, int i) {
        a(obj);
        this.b = -1;
        this.e = str;
        this.f = str2;
        this.j = str3;
        this.m = str4;
        this.n = i;
        this.t = 0;
    }
}