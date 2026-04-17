package t8;

import com.google.android.gms.internal.ads.dq0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import q8.a0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class p extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f18009a;

    public p(LinkedHashMap linkedHashMap) {
        this.f18009a = linkedHashMap;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        if (aVar.w() == 9) {
            aVar.s();
            return null;
        }
        Object objD = d();
        try {
            aVar.b();
            while (aVar.j()) {
                o oVar = (o) this.f18009a.get(aVar.q());
                if (oVar == null || !oVar.f17999d) {
                    aVar.C();
                } else {
                    f(objD, aVar, oVar);
                }
            }
            aVar.f();
            return e(objD);
        } catch (IllegalAccessException e10) {
            dq0 dq0Var = v8.b.f18515a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalStateException e11) {
            throw new q8.t(e11);
        }
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            bVar.j();
            return;
        }
        bVar.c();
        try {
            Iterator it = this.f18009a.values().iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(bVar, obj);
            }
            bVar.f();
        } catch (IllegalAccessException e10) {
            dq0 dq0Var = v8.b.f18515a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, y8.a aVar, o oVar);
}