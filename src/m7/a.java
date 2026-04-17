package m7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f15184a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f15185b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15186c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15187d;

    /* renamed from: e, reason: collision with root package name */
    public final d f15188e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f15189f;

    public a(HashSet hashSet, HashSet hashSet2, int i10, int i11, d dVar, Set set) {
        this.f15184a = Collections.unmodifiableSet(hashSet);
        this.f15185b = Collections.unmodifiableSet(hashSet2);
        this.f15186c = i10;
        this.f15187d = i11;
        this.f15188e = dVar;
        this.f15189f = Collections.unmodifiableSet(set);
    }

    public static a0.g a(Class cls) {
        return new a0.g(cls, new Class[0]);
    }

    public static a b(Object obj, Class cls, Class... clsArr) {
        a0.g gVar = new a0.g(cls, clsArr);
        gVar.f70e = new e0.g(obj, 1);
        return gVar.b();
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f15184a.toArray()) + ">{" + this.f15186c + ", type=" + this.f15187d + ", deps=" + Arrays.toString(this.f15185b.toArray()) + "}";
    }
}