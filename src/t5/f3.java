package t5;

import android.os.Bundle;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f3 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f17343b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f17344c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f17345d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final l4 f17346a;

    public f3(l4 l4Var) {
        this.f17346a = l4Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        fc.t.k(atomicReference);
        fc.t.c(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbN = ic1.n("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sbN.length() != 1) {
                    sbN.append(", ");
                }
                sbN.append(strB);
            }
        }
        sbN.append("]");
        return sbN.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f17346a.b()) {
            return bundle.toString();
        }
        StringBuilder sbN = ic1.n("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbN.length() != 8) {
                sbN.append(", ");
            }
            sbN.append(e(str));
            sbN.append("=");
            Object obj = bundle.get(str);
            sbN.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbN.append("}]");
        return sbN.toString();
    }

    public final String c(q qVar) {
        l4 l4Var = this.f17346a;
        if (!l4Var.b()) {
            return qVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(qVar.f17560f);
        sb.append(",name=");
        sb.append(d(qVar.f17558b));
        sb.append(",params=");
        p pVar = qVar.f17559e;
        sb.append(pVar == null ? null : !l4Var.b() ? pVar.f17544b.toString() : b(pVar.h()));
        return sb.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f17346a.b() ? str : g(str, j4.f17446c, j4.f17444a, f17343b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f17346a.b() ? str : g(str, j4.f17449f, j4.f17448e, f17344c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f17346a.b() ? str : str.startsWith("_exp_") ? a0.h.w("experiment_id(", str, ")") : g(str, j4.f17453j, j4.f17452i, f17345d);
    }
}