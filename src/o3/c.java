package o3;

import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f15695a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f15695a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f15695a.equals(((c) obj).f15695a);
    }

    public final int hashCode() {
        return this.f15695a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return r.g(new StringBuilder("Encoding{name=\""), this.f15695a, "\"}");
    }
}