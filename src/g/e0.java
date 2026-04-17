package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e0 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList localeListD = d2.c.d(configuration);
        LocaleList localeListD2 = d2.c.d(configuration2);
        if (d2.c.x(localeListD2, localeListD)) {
            return;
        }
        d2.c.n(configuration3, localeListD2);
        configuration3.locale = configuration2.locale;
    }

    public static k0.i b(Configuration configuration) {
        return k0.i.b(d2.c.k(d2.c.d(configuration)));
    }

    public static void c(k0.i iVar) {
        d2.c.p(d2.c.g(iVar.f13944a.a()));
    }

    public static void d(Configuration configuration, k0.i iVar) {
        d2.c.n(configuration, d2.c.g(iVar.f13944a.a()));
    }
}