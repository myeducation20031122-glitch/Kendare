package t5;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t1 extends u2 {

    /* renamed from: e, reason: collision with root package name */
    public final t.b f17610e;

    /* renamed from: f, reason: collision with root package name */
    public final t.b f17611f;

    /* renamed from: j, reason: collision with root package name */
    public long f17612j;

    public t1(b4 b4Var) {
        fc.t.k(b4Var);
        this.f15046b = b4Var;
        this.f17611f = new t.b();
        this.f17610e = new t.b();
    }

    public final void p(long j10, String str) {
        Object obj = this.f15046b;
        if (str == null || str.length() == 0) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.a("Ad unit id must be a non-empty string");
        } else {
            a4 a4Var = ((b4) obj).M;
            b4.i(a4Var);
            a4Var.x(new a(this, str, j10, 0));
        }
    }

    public final void q(long j10, String str) {
        Object obj = this.f15046b;
        if (str == null || str.length() == 0) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.a("Ad unit id must be a non-empty string");
        } else {
            a4 a4Var = ((b4) obj).M;
            b4.i(a4Var);
            a4Var.x(new a(this, str, j10, 1));
        }
    }

    public final void r(long j10) {
        b5 b5Var = ((b4) this.f15046b).R;
        b4.h(b5Var);
        y4 y4VarW = b5Var.w(false);
        t.b bVar = this.f17610e;
        Iterator it = ((t.h) bVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            t(str, j10 - ((Long) bVar.getOrDefault(str, null)).longValue(), y4VarW);
        }
        if (!bVar.isEmpty()) {
            s(j10 - this.f17612j, y4VarW);
        }
        u(j10);
    }

    public final void s(long j10, y4 y4Var) {
        Object obj = this.f15046b;
        if (y4Var == null) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.Q.a("Not logging ad exposure. No active activity");
        } else {
            if (j10 < 1000) {
                i3 i3Var2 = ((b4) obj).f17251w;
                b4.i(i3Var2);
                i3Var2.Q.b(Long.valueOf(j10), "Not logging ad exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            b6.C(y4Var, bundle, true);
            v4 v4Var = ((b4) obj).S;
            b4.h(v4Var);
            v4Var.w("am", "_xa", bundle);
        }
    }

    public final void t(String str, long j10, y4 y4Var) {
        Object obj = this.f15046b;
        if (y4Var == null) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.Q.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j10 < 1000) {
                i3 i3Var2 = ((b4) obj).f17251w;
                b4.i(i3Var2);
                i3Var2.Q.b(Long.valueOf(j10), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            b6.C(y4Var, bundle, true);
            v4 v4Var = ((b4) obj).S;
            b4.h(v4Var);
            v4Var.w("am", "_xu", bundle);
        }
    }

    public final void u(long j10) {
        t.b bVar = this.f17610e;
        Iterator it = ((t.h) bVar.keySet()).iterator();
        while (it.hasNext()) {
            bVar.put((String) it.next(), Long.valueOf(j10));
        }
        if (bVar.isEmpty()) {
            return;
        }
        this.f17612j = j10;
    }
}