package r7;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f16562b;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f16563e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f16564f;

    /* JADX INFO: Fake field, exist only in values array */
    d EF0;

    static {
        d dVar = new d("X86_32", 0);
        d dVar2 = new d("X86_64", 1);
        d dVar3 = new d("ARM_UNKNOWN", 2);
        d dVar4 = new d("PPC", 3);
        d dVar5 = new d("PPC64", 4);
        d dVar6 = new d("ARMV6", 5);
        d dVar7 = new d("ARMV7", 6);
        d dVar8 = new d("UNKNOWN", 7);
        f16562b = dVar8;
        d dVar9 = new d("ARMV7S", 8);
        d dVar10 = new d("ARM64", 9);
        f16564f = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10};
        HashMap map = new HashMap(4);
        f16563e = map;
        map.put("armeabi-v7a", dVar7);
        map.put("armeabi", dVar6);
        map.put("arm64-v8a", dVar10);
        map.put("x86", dVar);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f16564f.clone();
    }
}