package p5;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s extends b5.a {
    public static final Parcelable.Creator<s> CREATOR = new x4.n(6);

    /* renamed from: b, reason: collision with root package name */
    public final LocationRequest f15981b;

    public s(LocationRequest locationRequest, ArrayList arrayList, boolean z7, boolean z10, String str, boolean z11, boolean z12, String str2, long j10) {
        WorkSource workSource;
        r5.d dVar = new r5.d(locationRequest);
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a5.g gVar = (a5.g) it.next();
                    e5.e.a(workSource, gVar.f327b, gVar.f328e);
                }
            }
            dVar.f16543n = workSource;
        }
        boolean z13 = true;
        if (z7) {
            dVar.b(1);
        }
        if (z10) {
            dVar.c(2);
        }
        if (str != null) {
            if (Build.VERSION.SDK_INT < 30) {
                dVar.f16541l = str;
            }
        } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
            dVar.f16541l = str2;
        }
        if (z11) {
            dVar.f16542m = true;
        }
        if (z12) {
            dVar.f16537h = true;
        }
        if (j10 != Long.MAX_VALUE) {
            if (j10 != -1 && j10 < 0) {
                z13 = false;
            }
            fc.t.b("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z13);
            dVar.f16538i = j10;
        }
        this.f15981b = dVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return o5.y.i(this.f15981b, ((s) obj).f15981b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15981b.hashCode();
    }

    public final String toString() {
        return this.f15981b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.W(parcel, 1, this.f15981b, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}