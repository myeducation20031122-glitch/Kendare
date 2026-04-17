package d3;

import i3.m;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import s2.c0;
import s2.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f12302c = new c0(Object.class, Object.class, Object.class, Collections.singletonList(new n(Object.class, Object.class, Object.class, Collections.emptyList(), new c3.d(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final t.b f12303a = new t.b();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f12304b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, c0 c0Var) {
        synchronized (this.f12303a) {
            t.b bVar = this.f12303a;
            m mVar = new m(cls, cls2, cls3);
            if (c0Var == null) {
                c0Var = f12302c;
            }
            bVar.put(mVar, c0Var);
        }
    }
}