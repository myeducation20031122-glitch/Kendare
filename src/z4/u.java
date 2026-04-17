package z4;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u extends d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19708b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19709c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, y yVar, x4.b bVar) {
        super(yVar);
        this.f19710d = vVar;
        this.f19709c = bVar;
    }

    @Override // z4.d0
    public final void a() {
        a5.l t0Var;
        int i10 = this.f19708b;
        Object obj = this.f19710d;
        Object obj2 = this.f19709c;
        switch (i10) {
            case 0:
                ((v) obj).f19715j.k((x4.b) obj2);
                break;
            default:
                y yVar = (y) obj2;
                v5.h hVar = (v5.h) obj;
                if (yVar.n(0)) {
                    x4.b bVar = hVar.f18410e;
                    if (bVar.l()) {
                        a5.b0 b0Var = hVar.f18411f;
                        fc.t.k(b0Var);
                        x4.b bVar2 = b0Var.f301f;
                        if (!bVar2.l()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            yVar.k(bVar2);
                            break;
                        } else {
                            yVar.Q = true;
                            IBinder iBinder = b0Var.f300e;
                            if (iBinder == null) {
                                t0Var = null;
                            } else {
                                int i11 = a5.a.f294e;
                                String str = "com.google.android.gms.common.internal.IAccountAccessor";
                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                t0Var = iInterfaceQueryLocalInterface instanceof a5.l ? (a5.l) iInterfaceQueryLocalInterface : new a5.t0(iBinder, str, 2);
                            }
                            fc.t.k(t0Var);
                            yVar.R = t0Var;
                            yVar.S = b0Var.f302j;
                            yVar.T = b0Var.f303m;
                        }
                    } else if (!yVar.O || bVar.h()) {
                        yVar.k(bVar);
                        break;
                    } else {
                        yVar.a();
                    }
                    yVar.m();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, y yVar2, v5.h hVar) {
        super(yVar);
        this.f19709c = yVar2;
        this.f19710d = hVar;
    }
}