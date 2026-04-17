package a5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k0 extends l5.a {

    /* renamed from: e, reason: collision with root package name */
    public f f360e;

    /* renamed from: f, reason: collision with root package name */
    public final int f361f;

    public k0(f fVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f360e = fVar;
        this.f361f = i10;
    }

    @Override // l5.a
    public final boolean q2(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) n5.a.a(parcel, Bundle.CREATOR);
            n5.a.b(parcel);
            fc.t.l(this.f360e, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar = this.f360e;
            fVar.getClass();
            m0 m0Var = new m0(fVar, i11, strongBinder, bundle);
            j0 j0Var = fVar.N;
            j0Var.sendMessage(j0Var.obtainMessage(1, this.f361f, -1, m0Var));
            this.f360e = null;
        } else if (i10 == 2) {
            parcel.readInt();
            n5.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            o0 o0Var = (o0) n5.a.a(parcel, o0.CREATOR);
            n5.a.b(parcel);
            f fVar2 = this.f360e;
            fc.t.l(fVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            fc.t.k(o0Var);
            fVar2.f317d0 = o0Var;
            if (fVar2.F()) {
                i iVar = o0Var.f380j;
                p pVarA = p.a();
                q qVar = iVar == null ? null : iVar.f339b;
                synchronized (pVarA) {
                    if (qVar == null) {
                        pVarA.f383a = p.f382c;
                    } else {
                        q qVar2 = pVarA.f383a;
                        if (qVar2 == null || qVar2.f388b < qVar.f388b) {
                            pVarA.f383a = qVar;
                        }
                    }
                }
            }
            Bundle bundle2 = o0Var.f377b;
            fc.t.l(this.f360e, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar3 = this.f360e;
            fVar3.getClass();
            m0 m0Var2 = new m0(fVar3, i12, strongBinder2, bundle2);
            j0 j0Var2 = fVar3.N;
            j0Var2.sendMessage(j0Var2.obtainMessage(1, this.f361f, -1, m0Var2));
            this.f360e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}