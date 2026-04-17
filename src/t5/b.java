package t5;

import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends t5 {

    /* renamed from: j, reason: collision with root package name */
    public String f17224j;

    /* renamed from: m, reason: collision with root package name */
    public HashSet f17225m;

    /* renamed from: n, reason: collision with root package name */
    public t.b f17226n;

    /* renamed from: t, reason: collision with root package name */
    public Long f17227t;

    /* renamed from: u, reason: collision with root package name */
    public Long f17228u;

    @Override // t5.t5
    public final boolean r() {
        return false;
    }

    public final e6 s(Integer num) {
        if (this.f17226n.containsKey(num)) {
            return (e6) this.f17226n.getOrDefault(num, null);
        }
        e6 e6Var = new e6(this, this.f17224j);
        this.f17226n.put(num, e6Var);
        return e6Var;
    }
}