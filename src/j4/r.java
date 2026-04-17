package j4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r extends y9 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final c4.t f13786b;

    public r(c4.t tVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f13786b = tVar;
    }

    @Override // j4.v0
    public final void B(e2 e2Var) {
        c4.t tVar = this.f13786b;
        if (tVar != null) {
            tVar.b(e2Var.h());
        }
    }

    @Override // j4.v0
    public final void a() {
        c4.t tVar = this.f13786b;
        if (tVar != null) {
            tVar.c();
        }
    }

    @Override // j4.v0
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            e2 e2Var = (e2) z9.a(parcel, e2.CREATOR);
            z9.b(parcel);
            B(e2Var);
        } else if (i10 == 2) {
            a();
        } else if (i10 == 3) {
            zzc();
        } else if (i10 != 4 && i10 != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // j4.v0
    public final void zzb() {
    }

    @Override // j4.v0
    public final void zzc() {
        c4.t tVar = this.f13786b;
        if (tVar != null) {
            tVar.a();
        }
    }
}