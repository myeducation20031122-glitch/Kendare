package r3;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p implements o3.g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f16424a;

    /* renamed from: b, reason: collision with root package name */
    public final i f16425b;

    /* renamed from: c, reason: collision with root package name */
    public final q f16426c;

    public p(Set set, i iVar, q qVar) {
        this.f16424a = set;
        this.f16425b = iVar;
        this.f16426c = qVar;
    }

    public final q.d a(String str, o3.c cVar, o3.e eVar) {
        Set set = this.f16424a;
        if (set.contains(cVar)) {
            return new q.d(this.f16425b, str, cVar, eVar, this.f16426c, 3);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}