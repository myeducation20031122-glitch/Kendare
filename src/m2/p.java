package m2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.g8;
import com.google.android.gms.internal.ads.h8;
import com.google.android.gms.internal.measurement.u4;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.q2;
import com.google.android.gms.internal.play_billing.s2;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.Callable;
import l4.c0;
import l4.g0;
import t5.w3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15125b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15126e;

    public /* synthetic */ p(Object obj, int i10) {
        this.f15125b = i10;
        this.f15126e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        Bundle bundle;
        int i10;
        String strG;
        int iX;
        e eVar;
        boolean z7;
        q qVar = (q) this.f15126e;
        synchronized (qVar.f15127b) {
            try {
                if (qVar.f15128e) {
                    return;
                }
                m2 m2Var = null;
                if (TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                }
                int i11 = 3;
                try {
                    String packageName = qVar.f15130j.f15058e.getPackageName();
                    int i12 = 22;
                    int i13 = 22;
                    iX = 3;
                    while (true) {
                        z7 = true;
                        if (i13 < 3) {
                            i13 = 0;
                            break;
                        }
                        if (bundle == null) {
                            try {
                                j3 j3Var = (j3) qVar.f15130j.f15060g;
                                Parcel parcelT = j3Var.T();
                                parcelT.writeInt(i13);
                                parcelT.writeString(packageName);
                                parcelT.writeString("subs");
                                Parcel parcelP1 = j3Var.p1(parcelT, 1);
                                int i14 = parcelP1.readInt();
                                parcelP1.recycle();
                                iX = i14;
                            } catch (Exception e10) {
                                e = e10;
                                i11 = iX;
                                com.google.android.gms.internal.play_billing.r.f("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                i10 = e instanceof DeadObjectException ? 101 : e instanceof RemoteException ? 100 : e instanceof SecurityException ? 102 : 42;
                                if (i10 == 42) {
                                    String simpleName = e.getClass().getSimpleName();
                                    String message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    strG = a0.h.G(simpleName, ": ", message);
                                    if (strG.length() > 70) {
                                        strG = strG.substring(0, 70);
                                    }
                                } else {
                                    strG = null;
                                }
                                qVar.f15130j.f15054a = 0;
                                qVar.f15130j.f15060g = null;
                                iX = i11;
                                if (iX != 0) {
                                }
                                qVar.a(eVar);
                            }
                        } else {
                            iX = ((j3) qVar.f15130j.f15060g).x(i13, packageName, "subs", bundle);
                        }
                        if (iX == 0) {
                            com.google.android.gms.internal.play_billing.r.d("BillingClient", "highestLevelSupportedForSubs: " + i13);
                            break;
                        }
                        i13--;
                    }
                    qVar.f15130j.getClass();
                    qVar.f15130j.f15062i = i13 >= 3;
                    if (i13 < 3) {
                        com.google.android.gms.internal.play_billing.r.d("BillingClient", "In-app billing API does not support subscription on this device.");
                        i10 = 9;
                    } else {
                        i10 = 1;
                    }
                    while (true) {
                        if (i12 < 3) {
                            break;
                        }
                        if (bundle == null) {
                            j3 j3Var2 = (j3) qVar.f15130j.f15060g;
                            Parcel parcelT2 = j3Var2.T();
                            parcelT2.writeInt(i12);
                            parcelT2.writeString(packageName);
                            parcelT2.writeString("inapp");
                            Parcel parcelP12 = j3Var2.p1(parcelT2, 1);
                            int i15 = parcelP12.readInt();
                            parcelP12.recycle();
                            iX = i15;
                        } else {
                            iX = ((j3) qVar.f15130j.f15060g).x(i12, packageName, "inapp", bundle);
                        }
                        if (iX == 0) {
                            qVar.f15130j.f15063j = i12;
                            com.google.android.gms.internal.play_billing.r.d("BillingClient", "mHighestLevelSupportedForInApp: " + i12);
                            break;
                        }
                        i12--;
                    }
                    a aVar = qVar.f15130j;
                    int i16 = aVar.f15063j;
                    aVar.f15073t = i16 >= 21;
                    aVar.f15072s = i16 >= 20;
                    aVar.f15071r = i16 >= 19;
                    aVar.f15070q = i16 >= 17;
                    aVar.f15069p = i16 >= 16;
                    aVar.f15068o = i16 >= 15;
                    aVar.f15067n = i16 >= 14;
                    aVar.f15066m = i16 >= 10;
                    aVar.f15065l = i16 >= 9;
                    if (i16 < 6) {
                        z7 = false;
                    }
                    aVar.f15064k = z7;
                    if (i16 < 3) {
                        com.google.android.gms.internal.play_billing.r.e("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        i10 = 36;
                    }
                    if (iX == 0) {
                        qVar.f15130j.f15054a = 2;
                        if (qVar.f15130j.f15057d != null) {
                            qVar.f15130j.f15057d.a(qVar.f15130j.f15073t);
                        }
                    } else {
                        qVar.f15130j.f15054a = 0;
                        qVar.f15130j.f15060g = null;
                    }
                    strG = null;
                } catch (Exception e11) {
                    e = e11;
                }
                if (iX != 0) {
                    qVar.f15130j.j(r.b(6));
                    eVar = t.f15142k;
                } else {
                    a aVar2 = qVar.f15130j;
                    e eVar2 = t.f15132a;
                    int i17 = r.f15131a;
                    try {
                        q2 q2VarR = s2.r();
                        int i18 = eVar2.f15097b;
                        q2VarR.d();
                        s2.n((s2) q2VarR.f11183e, i18);
                        String str = eVar2.f15098c;
                        q2VarR.d();
                        s2.o((s2) q2VarR.f11183e, str);
                        q2VarR.d();
                        s2.q((s2) q2VarR.f11183e, i10);
                        if (strG != null) {
                            q2VarR.d();
                            s2.p((s2) q2VarR.f11183e, strG);
                        }
                        l2 l2VarQ = m2.q();
                        l2VarQ.d();
                        m2.o((m2) l2VarQ.f11183e, (s2) q2VarR.b());
                        l2VarQ.d();
                        m2.p((m2) l2VarQ.f11183e, 6);
                        m2Var = (m2) l2VarQ.b();
                    } catch (Exception e12) {
                        com.google.android.gms.internal.play_billing.r.f("BillingLogger", "Unable to create logging payload", e12);
                    }
                    aVar2.i(m2Var);
                    eVar = t.f15132a;
                }
                qVar.a(eVar);
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15125b) {
            case 0:
                a();
                return null;
            case QueueFuseable.SYNC /* 1 */:
                synchronized (((o2.d) this.f15126e)) {
                    try {
                        Object obj = this.f15126e;
                        if (((o2.d) obj).f15683w != null) {
                            ((o2.d) obj).o();
                            if (((o2.d) this.f15126e).g()) {
                                ((o2.d) this.f15126e).m();
                                ((o2.d) this.f15126e).N = 0;
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 2:
            default:
                return new u4(((w3) this.f15126e).N);
            case 3:
                Uri uri = (Uri) this.f15126e;
                c0 c0Var = g0.f14590i;
                g0 g0Var = i4.k.A.f13348c;
                return g0.h(uri);
            case 4:
                i4.j jVar = (i4.j) this.f15126e;
                String str = jVar.f13337b.f10587b;
                Context context = jVar.f13340j;
                g8.t(context, false);
                return new h8(new g8(context, str, false));
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return ((r4.a) this.f15126e).getViewSignals();
        }
    }
}