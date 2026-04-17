package k0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f13948a;

    public l(Object obj) {
        this.f13948a = d2.c.f(obj);
    }

    @Override // k0.k
    public final String a() {
        return this.f13948a.toLanguageTags();
    }

    @Override // k0.k
    public final Object b() {
        return this.f13948a;
    }

    public final boolean equals(Object obj) {
        return this.f13948a.equals(((k) obj).b());
    }

    @Override // k0.k
    public final Locale get(int i10) {
        return this.f13948a.get(i10);
    }

    public final int hashCode() {
        return this.f13948a.hashCode();
    }

    @Override // k0.k
    public final boolean isEmpty() {
        return this.f13948a.isEmpty();
    }

    @Override // k0.k
    public final int size() {
        return this.f13948a.size();
    }

    public final String toString() {
        return this.f13948a.toString();
    }
}