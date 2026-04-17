package g1;

import androidx.lifecycle.c1;
import androidx.lifecycle.t;
import com.google.android.gms.internal.ads.ic1;
import g.e;
import java.io.PrintWriter;
import t.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final t f12991a;

    /* renamed from: b, reason: collision with root package name */
    public final b f12992b;

    public c(t tVar, c1 c1Var) {
        this.f12991a = tVar;
        this.f12992b = (b) new e(c1Var, b.f12989b, 0).o(b.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        l lVar = this.f12992b.f12990a;
        if (lVar.f17009f > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (lVar.f17009f <= 0) {
                return;
            }
            ic1.v(lVar.f17008e[0]);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(lVar.f17007b[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        String hexString;
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        t tVar = this.f12991a;
        if (tVar == null) {
            hexString = "null";
        } else {
            String simpleName = tVar.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = tVar.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(tVar));
        }
        sb.append(hexString);
        sb.append("}}");
        return sb.toString();
    }
}