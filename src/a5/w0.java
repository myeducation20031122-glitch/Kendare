package a5;

import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class w0 extends l5.a implements d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f421e = 0;

    @Override // l5.a
    public final boolean q2(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            h5.a aVarZzd = ((x4.q) this).zzd();
            parcel2.writeNoException();
            n5.a.c(parcel2, aVarZzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((x4.q) this).f18981f);
        }
        return true;
    }
}