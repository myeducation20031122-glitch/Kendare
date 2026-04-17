package s2;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final e3.f f16801a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f16802b;

    public s(e3.f fVar, Executor executor) {
        this.f16801a = fVar;
        this.f16802b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f16801a.equals(((s) obj).f16801a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16801a.hashCode();
    }
}