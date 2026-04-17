package t5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.x9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b3 extends x9 implements c3 {
    public b3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 4);
    }

    @Override // t5.c3
    public final List E0(String str, String str2, String str3, boolean z7) {
        Parcel parcelT = T();
        parcelT.writeString(null);
        parcelT.writeString(str2);
        parcelT.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.y.f11107a;
        parcelT.writeInt(z7 ? 1 : 0);
        Parcel parcelP1 = p1(parcelT, 15);
        ArrayList arrayListCreateTypedArrayList = parcelP1.createTypedArrayList(y5.CREATOR);
        parcelP1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // t5.c3
    public final void F1(d6 d6Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        r3(parcelT, 18);
    }

    @Override // t5.c3
    public final List I1(String str, String str2, String str3) {
        Parcel parcelT = T();
        parcelT.writeString(null);
        parcelT.writeString(str2);
        parcelT.writeString(str3);
        Parcel parcelP1 = p1(parcelT, 17);
        ArrayList arrayListCreateTypedArrayList = parcelP1.createTypedArrayList(c.CREATOR);
        parcelP1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // t5.c3
    public final List N0(String str, String str2, d6 d6Var) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        Parcel parcelP1 = p1(parcelT, 16);
        ArrayList arrayListCreateTypedArrayList = parcelP1.createTypedArrayList(c.CREATOR);
        parcelP1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // t5.c3
    public final byte[] R1(q qVar, String str) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, qVar);
        parcelT.writeString(str);
        Parcel parcelP1 = p1(parcelT, 9);
        byte[] bArrCreateByteArray = parcelP1.createByteArray();
        parcelP1.recycle();
        return bArrCreateByteArray;
    }

    @Override // t5.c3
    public final List U1(String str, String str2, boolean z7, d6 d6Var) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.y.f11107a;
        parcelT.writeInt(z7 ? 1 : 0);
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        Parcel parcelP1 = p1(parcelT, 14);
        ArrayList arrayListCreateTypedArrayList = parcelP1.createTypedArrayList(y5.CREATOR);
        parcelP1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // t5.c3
    public final void V(y5 y5Var, d6 d6Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, y5Var);
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        r3(parcelT, 2);
    }

    @Override // t5.c3
    public final void Y(d6 d6Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        r3(parcelT, 4);
    }

    @Override // t5.c3
    public final String Y1(d6 d6Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        Parcel parcelP1 = p1(parcelT, 11);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // t5.c3
    public final void Y2(d6 d6Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        r3(parcelT, 6);
    }

    @Override // t5.c3
    public final void c3(q qVar, d6 d6Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, qVar);
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        r3(parcelT, 1);
    }

    @Override // t5.c3
    public final void f0(long j10, String str, String str2, String str3) {
        Parcel parcelT = T();
        parcelT.writeLong(j10);
        parcelT.writeString(str);
        parcelT.writeString(str2);
        parcelT.writeString(str3);
        r3(parcelT, 10);
    }

    @Override // t5.c3
    public final void l2(d6 d6Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        r3(parcelT, 20);
    }

    @Override // t5.c3
    public final void m1(Bundle bundle, d6 d6Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, bundle);
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        r3(parcelT, 19);
    }

    @Override // t5.c3
    public final void z0(c cVar, d6 d6Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.c(parcelT, cVar);
        com.google.android.gms.internal.measurement.y.c(parcelT, d6Var);
        r3(parcelT, 12);
    }
}