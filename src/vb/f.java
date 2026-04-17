package vb;

import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class f extends kotlin.reflect.jvm.internal.impl.storage.c {
    public volatile l9 j;

    @Override // kotlin.reflect.jvm.internal.impl.storage.c
    public final void b(Object obj) {
        this.j = new l9(obj);
        try {
            b bVar = (b) this;
            if (obj != null) {
                bVar.n.invoke(obj);
            } else {
                b.a(2);
                throw null;
            }
        } finally {
            this.j = null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.c
    public Object invoke() {
        l9 l9Var = this.j;
        if (l9Var == null || ((Thread) l9Var.f) != Thread.currentThread()) {
            return super.invoke();
        }
        if (((Thread) l9Var.f) == Thread.currentThread()) {
            return l9Var.e;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }
}