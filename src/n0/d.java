package n0;

import kotlin.jvm.internal.Intrinsics;
import v.e;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends e {

    /* renamed from: j, reason: collision with root package name */
    public final Object f15253j;

    public d(int i10) {
        super(i10, 1);
        this.f15253j = new Object();
    }

    @Override // v.e, n0.c
    public final boolean d(Object instance) {
        boolean zD;
        Intrinsics.f(instance, "instance");
        synchronized (this.f15253j) {
            zD = super.d(instance);
        }
        return zD;
    }

    @Override // v.e, n0.c
    public final Object j() {
        Object objJ;
        synchronized (this.f15253j) {
            objJ = super.j();
        }
        return objJ;
    }
}