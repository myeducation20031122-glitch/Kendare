package q2;

import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final g8.e f16128e = new g8.e();

    /* renamed from: a, reason: collision with root package name */
    public final Object f16129a;

    /* renamed from: b, reason: collision with root package name */
    public final l f16130b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16131c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f16132d;

    public m(String str, Object obj, l lVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f16131c = str;
        this.f16129a = obj;
        this.f16130b = lVar;
    }

    public static m a(Object obj, String str) {
        return new m(str, obj, f16128e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f16131c.equals(((m) obj).f16131c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16131c.hashCode();
    }

    public final String toString() {
        return kc.r.g(new StringBuilder("Option{key='"), this.f16131c, "'}");
    }
}