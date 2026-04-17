package t8;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;
import q8.a0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18020a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18021b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18022c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18023d;

    public u(Class cls) {
        this.f18020a = 1;
        this.f18021b = new HashMap();
        this.f18022c = new HashMap();
        this.f18023d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new x(cls))) {
                Enum r42 = (Enum) field.get(null);
                String strName = r42.name();
                String string = r42.toString();
                r8.b bVar = (r8.b) field.getAnnotation(r8.b.class);
                Object obj = this.f18021b;
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        ((Map) obj).put(str, r42);
                    }
                }
                ((Map) obj).put(strName, r42);
                ((Map) this.f18022c).put(string, r42);
                ((Map) this.f18023d).put(r42, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        int i10 = this.f18020a;
        Object obj = this.f18022c;
        switch (i10) {
            case 0:
                return ((a0) obj).b(aVar);
            default:
                if (aVar.w() == 9) {
                    aVar.s();
                    return null;
                }
                String strU = aVar.u();
                Enum r02 = (Enum) ((Map) this.f18021b).get(strU);
                return r02 == null ? (Enum) ((Map) obj).get(strU) : r02;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.reflect.Type] */
    @Override // q8.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(y8.b bVar, Object obj) {
        int i10 = this.f18020a;
        Object obj2 = this.f18023d;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) this.f18022c;
                ?? r12 = (Type) obj2;
                Class<?> cls = (obj == null || !((r12 instanceof Class) || (r12 instanceof TypeVariable))) ? r12 : obj.getClass();
                if (cls != r12) {
                    a0 a0VarC = ((q8.n) this.f18021b).c(new x8.a(cls));
                    if (a0VarC instanceof p) {
                        a0 a0Var2 = a0Var;
                        while (a0Var2 instanceof t) {
                            a0 a0Var3 = ((q8.m) ((t) a0Var2)).f16320a;
                            if (a0Var3 == null) {
                                throw new IllegalStateException("Delegate has not been set yet");
                            }
                            if (a0Var3 != a0Var2) {
                                a0Var2 = a0Var3;
                            } else if (a0Var2 instanceof p) {
                            }
                        }
                        if (a0Var2 instanceof p) {
                        }
                    } else {
                        a0Var = a0VarC;
                    }
                }
                a0Var.c(bVar, obj);
                return;
            default:
                Enum r62 = (Enum) obj;
                bVar.q(r62 == null ? null : (String) ((Map) obj2).get(r62));
                return;
        }
    }

    public u(q8.n nVar, a0 a0Var, Type type) {
        this.f18020a = 0;
        this.f18021b = nVar;
        this.f18022c = a0Var;
        this.f18023d = type;
    }
}