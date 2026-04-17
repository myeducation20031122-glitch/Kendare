package s2;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final q2.j f16687a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16688b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f16689c;

    public b(q2.j jVar, y yVar, ReferenceQueue referenceQueue, boolean z7) {
        e0 e0Var;
        super(yVar, referenceQueue);
        if (jVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f16687a = jVar;
        if (yVar.f16825b && z7) {
            e0Var = yVar.f16827f;
            g5.a.f(e0Var);
        } else {
            e0Var = null;
        }
        this.f16689c = e0Var;
        this.f16688b = yVar.f16825b;
    }
}