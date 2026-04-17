package k0;

import android.os.Build;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f13943b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final k f13944a;

    public i(k kVar) {
        this.f13944a = kVar;
    }

    public static i a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new i(new l(h.a(localeArr))) : new i(new j(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return f13943b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = g.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (this.f13944a.equals(((i) obj).f13944a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13944a.hashCode();
    }

    public final String toString() {
        return this.f13944a.toString();
    }
}