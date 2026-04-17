package j4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.q90;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y2 extends y9 implements z1 {

    /* renamed from: b, reason: collision with root package name */
    public final q90 f13792b;

    public y2(q90 q90Var) {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
        this.f13792b = q90Var;
    }

    @Override // j4.z1
    public final void K(boolean z7) {
        this.f13792b.getClass();
    }

    @Override // j4.z1
    public final void b() {
        x1 x1VarH = this.f13792b.f7675a.H();
        z1 z1VarZzi = null;
        if (x1VarH != null) {
            try {
                z1VarZzi = x1VarH.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (z1VarZzi == null) {
            return;
        }
        try {
            z1VarZzi.b();
        } catch (RemoteException e10) {
            wr.h("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            zzi();
        } else if (i10 == 2) {
            zzh();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 != 4) {
            if (i10 != 5) {
                return false;
            }
            ClassLoader classLoader = z9.f10427a;
            boolean z7 = parcel.readInt() != 0;
            z9.b(parcel);
            K(z7);
        } else {
            b();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // j4.z1
    public final void zzg() {
        x1 x1VarH = this.f13792b.f7675a.H();
        z1 z1VarZzi = null;
        if (x1VarH != null) {
            try {
                z1VarZzi = x1VarH.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (z1VarZzi == null) {
            return;
        }
        try {
            z1VarZzi.zzg();
        } catch (RemoteException e10) {
            wr.h("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // j4.z1
    public final void zzh() {
        this.f13792b.getClass();
    }

    @Override // j4.z1
    public final void zzi() {
        x1 x1VarH = this.f13792b.f7675a.H();
        z1 z1VarZzi = null;
        if (x1VarH != null) {
            try {
                z1VarZzi = x1VarH.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (z1VarZzi == null) {
            return;
        }
        try {
            z1VarZzi.zzi();
        } catch (RemoteException e10) {
            wr.h("Unable to call onVideoEnd()", e10);
        }
    }
}