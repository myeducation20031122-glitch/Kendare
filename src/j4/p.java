package j4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.y9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends y9 implements t {

    /* renamed from: b, reason: collision with root package name */
    public final a f13779b;

    public p(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f13779b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }

    @Override // j4.t
    public final void zzb() {
        this.f13779b.m();
    }
}