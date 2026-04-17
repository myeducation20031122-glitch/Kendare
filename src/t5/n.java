package t5;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f17508a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17509b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17510c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17511d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17512e;

    /* renamed from: f, reason: collision with root package name */
    public final p f17513f;

    public n(b4 b4Var, String str, String str2, String str3, long j10, long j11, p pVar) {
        fc.t.g(str2);
        fc.t.g(str3);
        fc.t.k(pVar);
        this.f17508a = str2;
        this.f17509b = str3;
        this.f17510c = true == TextUtils.isEmpty(str) ? null : str;
        this.f17511d = j10;
        this.f17512e = j11;
        if (j11 != 0 && j11 > j10) {
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.f17400w.c(i3.y(str2), "Event created with reverse previous/current timestamps. appId, name", i3.y(str3));
        }
        this.f17513f = pVar;
    }

    public final n a(b4 b4Var, long j10) {
        return new n(b4Var, this.f17510c, this.f17508a, this.f17509b, this.f17511d, j10, this.f17513f);
    }

    public final String toString() {
        String string = this.f17513f.f17544b.toString();
        StringBuilder sb = new StringBuilder("Event{appId='");
        sb.append(this.f17508a);
        sb.append("', name='");
        return kc.r.h(sb, this.f17509b, "', params=", string, "}");
    }

    public n(b4 b4Var, String str, String str2, String str3, long j10, Bundle bundle) {
        p pVar;
        fc.t.g(str2);
        fc.t.g(str3);
        this.f17508a = str2;
        this.f17509b = str3;
        this.f17510c = true == TextUtils.isEmpty(str) ? null : str;
        this.f17511d = j10;
        this.f17512e = 0L;
        if (bundle.isEmpty()) {
            pVar = new p(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    i3 i3Var = b4Var.f17251w;
                    b4.i(i3Var);
                    i3Var.f17397n.a("Param name can't be null");
                } else {
                    b6 b6Var = b4Var.O;
                    b4.g(b6Var);
                    Object objS = b6Var.s(bundle2.get(next), next);
                    if (objS == null) {
                        i3 i3Var2 = b4Var.f17251w;
                        b4.i(i3Var2);
                        i3Var2.f17400w.b(b4Var.P.e(next), "Param value can't be null");
                    } else {
                        b6 b6Var2 = b4Var.O;
                        b4.g(b6Var2);
                        b6Var2.G(bundle2, next, objS);
                    }
                }
                it.remove();
            }
            pVar = new p(bundle2);
        }
        this.f17513f = pVar;
    }
}