package m7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o implements i8.c {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f15214a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f15215b;

    public final synchronized void a() {
        try {
            Iterator it = this.f15214a.iterator();
            while (it.hasNext()) {
                this.f15215b.add(((i8.c) it.next()).get());
            }
            this.f15214a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // i8.c
    public final Object get() {
        if (this.f15215b == null) {
            synchronized (this) {
                try {
                    if (this.f15215b == null) {
                        this.f15215b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f15215b);
    }
}