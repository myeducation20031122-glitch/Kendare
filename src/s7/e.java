package s7;

import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f16878c = new e(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f16879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16880b;

    public e(int i10, int i11) {
        this.f16879a = i10;
        this.f16880b = i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(e.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.f16879a);
        sb.append(", length = ");
        return r.f(sb, this.f16880b, "]");
    }
}