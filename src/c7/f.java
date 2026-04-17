package c7;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements d7.c {

    /* renamed from: b, reason: collision with root package name */
    public final a2.f f2161b;

    public f(a2.f fVar) {
        this.f2161b = fVar;
    }

    @Override // d7.c
    public final Object zza() {
        Context context = this.f2161b.f243e;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}