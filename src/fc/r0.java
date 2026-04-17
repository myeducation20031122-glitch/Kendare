package fc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class r0 extends kotlinx.coroutines.internal.b {
    public final kotlinx.coroutines.internal.h b;
    public kotlinx.coroutines.internal.h c;
    public final /* synthetic */ s0 d;
    public final /* synthetic */ Object e;

    public r0(kotlinx.coroutines.internal.h hVar, s0 s0Var, Object obj) {
        this.d = s0Var;
        this.e = obj;
        this.b = hVar;
    }

    @Override // kotlinx.coroutines.internal.b
    public final void b(Object obj, Object obj2) {
        kotlinx.coroutines.internal.h hVar = (kotlinx.coroutines.internal.h) obj;
        boolean z = obj2 == null;
        kotlinx.coroutines.internal.h hVar2 = this.b;
        kotlinx.coroutines.internal.h hVar3 = z ? hVar2 : this.c;
        if (hVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.h.b;
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, this, hVar3)) {
                if (atomicReferenceFieldUpdater.get(hVar) != this) {
                    return;
                }
            }
            if (z) {
                kotlinx.coroutines.internal.h hVar4 = this.c;
                Intrinsics.c(hVar4);
                hVar2.g(hVar4);
            }
        }
    }

    @Override // kotlinx.coroutines.internal.b
    public final r4.d c(Object obj) {
        if (this.d.r() == this.e) {
            return null;
        }
        return kotlinx.coroutines.internal.f.a;
    }
}