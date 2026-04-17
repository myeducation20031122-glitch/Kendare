package s5;

import android.os.Bundle;
import android.os.SystemClock;
import fc.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l.g;
import t5.a4;
import t5.b4;
import t5.b5;
import t5.b6;
import t5.i3;
import t5.t1;
import t5.v4;
import t5.y4;
import t5.y5;
import w2.k;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final b4 f16852a;

    /* renamed from: b, reason: collision with root package name */
    public final v4 f16853b;

    public a(b4 b4Var) {
        t.k(b4Var);
        this.f16852a = b4Var;
        v4 v4Var = b4Var.S;
        b4.h(v4Var);
        this.f16853b = v4Var;
    }

    @Override // t5.w4
    public final void I(String str) {
        b4 b4Var = this.f16852a;
        t1 t1VarK = b4Var.k();
        b4Var.Q.getClass();
        t1VarK.q(SystemClock.elapsedRealtime(), str);
    }

    @Override // t5.w4
    public final void a(String str) {
        b4 b4Var = this.f16852a;
        t1 t1VarK = b4Var.k();
        b4Var.Q.getClass();
        t1VarK.p(SystemClock.elapsedRealtime(), str);
    }

    @Override // t5.w4
    public final void b(String str, String str2, Bundle bundle) {
        v4 v4Var = this.f16852a.S;
        b4.h(v4Var);
        v4Var.s(str, str2, bundle);
    }

    @Override // t5.w4
    public final List c(String str, String str2) {
        v4 v4Var = this.f16853b;
        b4 b4Var = (b4) v4Var.f15046b;
        a4 a4Var = b4Var.M;
        b4.i(a4Var);
        boolean z7 = a4Var.z();
        i3 i3Var = b4Var.f17251w;
        if (z7) {
            b4.i(i3Var);
            i3Var.f17397n.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (k.i()) {
            b4.i(i3Var);
            i3Var.f17397n.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        a4 a4Var2 = b4Var.M;
        b4.i(a4Var2);
        a4Var2.t(atomicReference, 5000L, "get conditional user properties", new g(v4Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return b6.z(list);
        }
        b4.i(i3Var);
        i3Var.f17397n.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // t5.w4
    public final Map d(String str, String str2, boolean z7) {
        String str3;
        v4 v4Var = this.f16853b;
        b4 b4Var = (b4) v4Var.f15046b;
        a4 a4Var = b4Var.M;
        b4.i(a4Var);
        boolean z10 = a4Var.z();
        i3 i3Var = b4Var.f17251w;
        if (z10) {
            b4.i(i3Var);
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!k.i()) {
                AtomicReference atomicReference = new AtomicReference();
                a4 a4Var2 = b4Var.M;
                b4.i(a4Var2);
                a4Var2.t(atomicReference, 5000L, "get user properties", new androidx.fragment.app.g(v4Var, atomicReference, str, str2, z7));
                List<y5> list = (List) atomicReference.get();
                if (list == null) {
                    b4.i(i3Var);
                    i3Var.f17397n.b(Boolean.valueOf(z7), "Timed out waiting for handle get user properties, includeInternal");
                    return Collections.emptyMap();
                }
                t.b bVar = new t.b(list.size());
                for (y5 y5Var : list) {
                    Object objH = y5Var.h();
                    if (objH != null) {
                        bVar.put(y5Var.f17697e, objH);
                    }
                }
                return bVar;
            }
            b4.i(i3Var);
            str3 = "Cannot get user properties from main thread";
        }
        i3Var.f17397n.a(str3);
        return Collections.emptyMap();
    }

    @Override // t5.w4
    public final void e(Bundle bundle) {
        v4 v4Var = this.f16853b;
        ((b4) v4Var.f15046b).Q.getClass();
        v4Var.A(bundle, System.currentTimeMillis());
    }

    @Override // t5.w4
    public final void f(String str, String str2, Bundle bundle) {
        v4 v4Var = this.f16853b;
        ((b4) v4Var.f15046b).Q.getClass();
        v4Var.u(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // t5.w4
    public final int zza(String str) {
        v4 v4Var = this.f16853b;
        v4Var.getClass();
        t.g(str);
        ((b4) v4Var.f15046b).getClass();
        return 25;
    }

    @Override // t5.w4
    public final long zzb() {
        b6 b6Var = this.f16852a.O;
        b4.g(b6Var);
        return b6Var.t0();
    }

    @Override // t5.w4
    public final String zzh() {
        return (String) this.f16853b.f17643t.get();
    }

    @Override // t5.w4
    public final String zzi() {
        b5 b5Var = ((b4) this.f16853b.f15046b).R;
        b4.h(b5Var);
        y4 y4Var = b5Var.f17252f;
        if (y4Var != null) {
            return y4Var.f17691b;
        }
        return null;
    }

    @Override // t5.w4
    public final String zzj() {
        b5 b5Var = ((b4) this.f16853b.f15046b).R;
        b4.h(b5Var);
        y4 y4Var = b5Var.f17252f;
        if (y4Var != null) {
            return y4Var.f17690a;
        }
        return null;
    }

    @Override // t5.w4
    public final String zzk() {
        return (String) this.f16853b.f17643t.get();
    }
}