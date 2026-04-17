package u2;

import i3.o;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f18230a;

    public c(int i10) {
        if (i10 != 1) {
            this.f18230a = new ArrayDeque();
        } else {
            char[] cArr = o.f13305a;
            this.f18230a = new ArrayDeque(0);
        }
    }

    public final b a() {
        b bVar;
        synchronized (this.f18230a) {
            bVar = (b) this.f18230a.poll();
        }
        return bVar == null ? new b() : bVar;
    }

    public final void b(b bVar) {
        synchronized (this.f18230a) {
            try {
                if (this.f18230a.size() < 10) {
                    this.f18230a.offer(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void c(p2.d dVar) {
        dVar.f15893b = null;
        dVar.f15894c = null;
        this.f18230a.offer(dVar);
    }
}