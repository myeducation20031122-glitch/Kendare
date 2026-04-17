package k2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends c7.b {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13961c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13962d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13963e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13964f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13965g;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f13961c = atomicReferenceFieldUpdater;
        this.f13962d = atomicReferenceFieldUpdater2;
        this.f13963e = atomicReferenceFieldUpdater3;
        this.f13964f = atomicReferenceFieldUpdater4;
        this.f13965g = atomicReferenceFieldUpdater5;
    }

    @Override // c7.b
    public final boolean a(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13964f;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // c7.b
    public final boolean c(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13965g;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // c7.b
    public final boolean e(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13963e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // c7.b
    public final void i(g gVar, g gVar2) {
        this.f13962d.lazySet(gVar, gVar2);
    }

    @Override // c7.b
    public final void k(g gVar, Thread thread) {
        this.f13961c.lazySet(gVar, thread);
    }
}