package z4;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.bu0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q0 implements x5.e {

    /* renamed from: b, reason: collision with root package name */
    public final g f19688b;

    /* renamed from: e, reason: collision with root package name */
    public final int f19689e;

    /* renamed from: f, reason: collision with root package name */
    public final a f19690f;

    /* renamed from: j, reason: collision with root package name */
    public final long f19691j;

    /* renamed from: m, reason: collision with root package name */
    public final long f19692m;

    public q0(g gVar, int i10, a aVar, long j10, long j11) {
        this.f19688b = gVar;
        this.f19689e = i10;
        this.f19690f = aVar;
        this.f19691j = j10;
        this.f19692m = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a5.i a(i0 i0Var, a5.f fVar, int i10) {
        a5.o0 o0Var = fVar.f317d0;
        a5.i iVar = o0Var == null ? null : o0Var.f380j;
        if (iVar != null && iVar.f340e) {
            int[] iArr = iVar.f342j;
            int i11 = 0;
            if (iArr == null) {
                int[] iArr2 = iVar.f344n;
                if (iArr2 != null) {
                    while (i11 < iArr2.length) {
                        if (iArr2[i11] != i10) {
                            i11++;
                        }
                    }
                }
                if (i0Var.O >= iVar.f343m) {
                    return iVar;
                }
                return null;
            }
            while (i11 < iArr.length) {
                if (iArr[i11] != i10) {
                    i11++;
                } else if (i0Var.O >= iVar.f343m) {
                }
            }
        }
        return null;
    }

    @Override // x5.e
    public final void onComplete(x5.k kVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        long j11;
        int iElapsedRealtime;
        if (this.f19688b.a()) {
            a5.q qVar = a5.p.a().f383a;
            if (qVar == null || qVar.f389e) {
                i0 i0Var = (i0) this.f19688b.M.get(this.f19690f);
                if (i0Var != null) {
                    a5.k kVar2 = i0Var.f19650e;
                    if (kVar2 instanceof a5.f) {
                        int i14 = 0;
                        boolean z7 = this.f19691j > 0;
                        int i15 = kVar2.Y;
                        if (qVar != null) {
                            z7 &= qVar.f390f;
                            int i16 = qVar.f391j;
                            int i17 = qVar.f392m;
                            i10 = qVar.f388b;
                            if (kVar2.f317d0 != null && !kVar2.D()) {
                                a5.i iVarA = a(i0Var, kVar2, this.f19689e);
                                if (iVarA == null) {
                                    return;
                                }
                                boolean z10 = iVarA.f341f && this.f19691j > 0;
                                i17 = iVarA.f343m;
                                z7 = z10;
                            }
                            i11 = i16;
                            i12 = i17;
                        } else {
                            i10 = 0;
                            i11 = 5000;
                            i12 = 100;
                        }
                        g gVar = this.f19688b;
                        if (kVar.j()) {
                            i13 = 0;
                        } else {
                            if (((x5.s) kVar).f19034d) {
                                i14 = 100;
                            } else {
                                Exception excG = kVar.g();
                                if (excG instanceof y4.f) {
                                    Status status = ((y4.f) excG).f19238b;
                                    int i18 = status.f2482b;
                                    x4.b bVar = status.f2485j;
                                    if (bVar == null) {
                                        i14 = i18;
                                    } else {
                                        i13 = bVar.f18952e;
                                        i14 = i18;
                                    }
                                } else {
                                    i14 = 101;
                                }
                            }
                            i13 = -1;
                        }
                        if (z7) {
                            long j12 = this.f19691j;
                            long j13 = this.f19692m;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                            j11 = jCurrentTimeMillis;
                            j10 = j12;
                        } else {
                            j10 = 0;
                            j11 = 0;
                            iElapsedRealtime = -1;
                        }
                        gVar.getClass();
                        r0 r0Var = new r0(new a5.o(this.f19689e, i14, i13, j10, j11, null, null, i15, iElapsedRealtime), i10, i11, i12);
                        bu0 bu0Var = gVar.P;
                        bu0Var.sendMessage(bu0Var.obtainMessage(18, r0Var));
                    }
                }
            }
        }
    }
}