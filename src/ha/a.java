package ha;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13212b = new a();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a10 = (Comparable) obj;
        Comparable b7 = (Comparable) obj2;
        Intrinsics.f(a10, "a");
        Intrinsics.f(b7, "b");
        return a10.compareTo(b7);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return b.f13213b;
    }
}