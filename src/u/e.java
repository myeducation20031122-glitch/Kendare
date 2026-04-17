package u;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends c7.b {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18099c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18100d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18101e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18102f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18103g;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f18099c = atomicReferenceFieldUpdater;
        this.f18100d = atomicReferenceFieldUpdater2;
        this.f18101e = atomicReferenceFieldUpdater3;
        this.f18102f = atomicReferenceFieldUpdater4;
        this.f18103g = atomicReferenceFieldUpdater5;
    }

    @Override // c7.b
    public final boolean b(g gVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18102f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == dVar);
        return false;
    }

    @Override // c7.b
    public final boolean d(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18103g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // c7.b
    public final boolean f(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18101e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // c7.b
    public final void j(f fVar, f fVar2) {
        this.f18100d.lazySet(fVar, fVar2);
    }

    @Override // c7.b
    public final void l(f fVar, Thread thread) {
        this.f18099c.lazySet(fVar, thread);
    }
}