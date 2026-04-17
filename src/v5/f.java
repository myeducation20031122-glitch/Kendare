package v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import y4.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends b5.a implements n {
    public static final Parcelable.Creator<f> CREATOR = new x4.n(24);

    /* renamed from: b, reason: collision with root package name */
    public final List f18405b;

    /* renamed from: e, reason: collision with root package name */
    public final String f18406e;

    public f(String str, ArrayList arrayList) {
        this.f18405b = arrayList;
        this.f18406e = str;
    }

    @Override // y4.n
    public final Status a() {
        return this.f18406e != null ? Status.f2478m : Status.f2481u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.Z(parcel, 1, this.f18405b);
        com.bumptech.glide.e.X(parcel, 2, this.f18406e);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}