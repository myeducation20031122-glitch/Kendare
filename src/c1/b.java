package c1;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2048c = new b(EmptySet.f14122b);

    /* renamed from: a, reason: collision with root package name */
    public final Set f2049a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2050b;

    public b(EmptySet flags) {
        Intrinsics.f(flags, "flags");
        this.f2049a = flags;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EmptySet.f14122b.getClass();
        EmptyIterator.f14120b.getClass();
        this.f2050b = linkedHashMap;
    }
}