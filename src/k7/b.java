package k7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.l9;
import fc.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import n8.s;
import p5.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f14024c;

    /* renamed from: a, reason: collision with root package name */
    public final g f14025a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14026b;

    public b(g gVar) {
        t.k(gVar);
        this.f14025a = gVar;
        this.f14026b = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, String str2, Bundle bundle) {
        char c10;
        String str3;
        if ((!l7.b.f14657c.contains(str)) && !l7.b.f14656b.contains(str2)) {
            Iterator it = l7.b.f14658d.iterator();
            while (it.hasNext()) {
                if (bundle.containsKey((String) it.next())) {
                    return;
                }
            }
            if ("_cmp".equals(str2)) {
                if (!(!l7.b.f14657c.contains(str))) {
                    return;
                }
                Iterator it2 = l7.b.f14658d.iterator();
                while (it2.hasNext()) {
                    if (bundle.containsKey((String) it2.next())) {
                        return;
                    }
                }
                int iHashCode = str.hashCode();
                if (iHashCode == 101200) {
                    if (str.equals("fcm")) {
                        c10 = 0;
                    }
                    if (c10 == 0) {
                    }
                    bundle.putString("_cis", str3);
                } else if (iHashCode != 101230) {
                    c10 = (iHashCode == 3142703 && str.equals("fiam")) ? (char) 2 : (char) 65535;
                    if (c10 == 0) {
                        str3 = "fcm_integration";
                    } else if (c10 == 1) {
                        str3 = "fdl_integration";
                    } else if (c10 != 2) {
                        return;
                    } else {
                        str3 = "fiam_integration";
                    }
                    bundle.putString("_cis", str3);
                } else {
                    if (str.equals("fdl")) {
                        c10 = 1;
                    }
                    if (c10 == 0) {
                    }
                    bundle.putString("_cis", str3);
                }
            }
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            j1 j1Var = (j1) this.f14025a.f15951b;
            j1Var.getClass();
            j1Var.b(new d1(j1Var, str, str2, bundle, true));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l9 b(l9 l9Var, String str) {
        o5.d dVar;
        if (!(!l7.b.f14657c.contains(str))) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f14026b;
        if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        g gVar = this.f14025a;
        if (zEquals) {
            s sVar = new s();
            sVar.f15436e = l9Var;
            sVar.f15437f = gVar;
            l7.c cVar = new l7.c(sVar, 0);
            sVar.f15438j = cVar;
            gVar.p(cVar);
            sVar.f15435b = new HashSet();
            dVar = sVar;
        } else {
            dVar = ("crash".equals(str) || "clx".equals(str)) ? new o5.d(gVar, l9Var) : null;
        }
        if (dVar == null) {
            return null;
        }
        concurrentHashMap.put(str, dVar);
        return new l9(11, this, str);
    }
}