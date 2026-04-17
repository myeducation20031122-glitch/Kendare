package m7;

import androidx.fragment.app.y;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s extends i7.a {

    /* renamed from: f, reason: collision with root package name */
    public final Set f15220f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f15221g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f15222h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f15223i;

    /* renamed from: j, reason: collision with root package name */
    public final Set f15224j;

    /* renamed from: k, reason: collision with root package name */
    public final b f15225k;

    public s(a aVar, g gVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (j jVar : aVar.f15185b) {
            int i10 = jVar.f15206c;
            boolean z7 = i10 == 0;
            int i11 = jVar.f15205b;
            Class cls = jVar.f15204a;
            if (z7) {
                if (i11 == 2) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else if (i10 == 2) {
                hashSet3.add(cls);
            } else if (i11 == 2) {
                hashSet5.add(cls);
            } else {
                hashSet2.add(cls);
            }
        }
        if (!aVar.f15189f.isEmpty()) {
            hashSet.add(f8.b.class);
        }
        this.f15220f = Collections.unmodifiableSet(hashSet);
        this.f15221g = Collections.unmodifiableSet(hashSet2);
        this.f15222h = Collections.unmodifiableSet(hashSet3);
        this.f15223i = Collections.unmodifiableSet(hashSet4);
        this.f15224j = Collections.unmodifiableSet(hashSet5);
        this.f15225k = gVar;
    }

    @Override // i7.a, m7.b
    public final Object a(Class cls) {
        if (!this.f15220f.contains(cls)) {
            throw new y(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f15225k.a(cls);
        if (!cls.equals(f8.b.class)) {
            return objA;
        }
        return new r();
    }

    @Override // i7.a, m7.b
    public final Set b(Class cls) {
        if (this.f15223i.contains(cls)) {
            return this.f15225k.b(cls);
        }
        throw new y(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // m7.b
    public final i8.c c(Class cls) {
        if (this.f15221g.contains(cls)) {
            return this.f15225k.c(cls);
        }
        throw new y(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // m7.b
    public final i8.c d(Class cls) {
        if (this.f15224j.contains(cls)) {
            return this.f15225k.d(cls);
        }
        throw new y(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // m7.b
    public final i8.b e(Class cls) {
        if (this.f15222h.contains(cls)) {
            return this.f15225k.e(cls);
        }
        throw new y(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}