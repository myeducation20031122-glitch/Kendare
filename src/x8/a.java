package x8;

import java.lang.reflect.Type;
import java.util.Objects;
import s8.d;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f19110a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f19111b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19112c;

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = d.a(type);
        this.f19111b = typeA;
        this.f19110a = d.f(typeA);
        this.f19112c = typeA.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (d.d(this.f19111b, ((a) obj).f19111b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19112c;
    }

    public final String toString() {
        return d.h(this.f19111b);
    }
}