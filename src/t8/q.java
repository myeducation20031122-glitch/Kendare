package t8;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends p {

    /* renamed from: b, reason: collision with root package name */
    public final s8.o f18010b;

    public q(s8.o oVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f18010b = oVar;
    }

    @Override // t8.p
    public final Object d() {
        return this.f18010b.j();
    }

    @Override // t8.p
    public final Object e(Object obj) {
        return obj;
    }

    @Override // t8.p
    public final void f(Object obj, y8.a aVar, o oVar) throws IllegalAccessException, IllegalArgumentException {
        Object objB = oVar.f18004i.b(aVar);
        if (objB == null && oVar.f18007l) {
            return;
        }
        boolean z7 = oVar.f18000e;
        Field field = oVar.f18002g;
        if (z7) {
            s.a(obj, field);
        } else if (oVar.f18008m) {
            throw new m7.p(a0.h.v("Cannot set value of 'static final' ", v8.b.c(field, false)));
        }
        field.set(obj, objB);
    }
}