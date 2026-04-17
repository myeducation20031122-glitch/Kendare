package m2;

import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.o2;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.q2;
import com.google.android.gms.internal.play_billing.s2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15131a = 0;

    static {
        int i10 = s.D;
    }

    public static m2 a(int i10, int i11, e eVar) {
        try {
            l2 l2VarQ = m2.q();
            q2 q2VarR = s2.r();
            int i12 = eVar.f15097b;
            q2VarR.d();
            s2.n((s2) q2VarR.f11183e, i12);
            String str = eVar.f15098c;
            q2VarR.d();
            s2.o((s2) q2VarR.f11183e, str);
            q2VarR.d();
            s2.q((s2) q2VarR.f11183e, i10);
            l2VarQ.d();
            m2.o((m2) l2VarQ.f11183e, (s2) q2VarR.b());
            l2VarQ.d();
            m2.p((m2) l2VarQ.f11183e, i11);
            return (m2) l2VarQ.b();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.r.f("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static p2 b(int i10) {
        try {
            o2 o2VarO = p2.o();
            o2VarO.d();
            p2.n((p2) o2VarO.f11183e, i10);
            return (p2) o2VarO.b();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.r.f("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}